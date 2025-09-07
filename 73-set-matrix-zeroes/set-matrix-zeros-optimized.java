class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: check if first row has a zero
        for (int col = 0; col < colLen; col++) {
            if (matrix[0][col] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: check if first col has a zero
        for (int row = 0; row < rowLen; row++) {
            if (matrix[row][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 3: use first row and col as markers
        for (int row = 1; row < rowLen; row++) {
            for (int col = 1; col < colLen; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Step 4: set zeroes based on markers
        for (int row = 1; row < rowLen; row++) {
            for (int col = 1; col < colLen; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Step 5: handle first row
        if (firstRowZero) {
            for (int col = 0; col < colLen; col++) {
                matrix[0][col] = 0;
            }
        }

        // Step 6: handle first col
        if (firstColZero) {
            for (int row = 0; row < rowLen; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}
