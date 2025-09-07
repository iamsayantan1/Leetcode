class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        int rowLen = matrix.length;
        int colLen = rowLen!=0 ? matrix[0].length : 0;

        for(int row=0 ; row<rowLen ; row++) {
            for(int col=0 ; col<colLen ; col++) {
                if(matrix[row][col] == 0) {
                    rows.add(row);
                    cols.add(col);
                }
            }
        }

        for(int row : rows) {
            for(int col=0 ; col<colLen ; col++) {
                matrix[row][col] = 0;
            }
        }

        for(int col : cols) {
            for(int row=0 ; row<rowLen ; row++) {
                matrix[row][col] = 0;
            }
        }
    }
}