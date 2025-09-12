class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        boolean rowZero=false;
        boolean colZero=false;

        for(int row=0;row<m;row++) {
            if(matrix[row][0]==0) {
                rowZero=true;
                break;
            }
        }

        for(int col=0;col<n;col++) {
            if(matrix[0][col]==0) {
                colZero=true;
                break;
            }
        }

        for(int row=1;row<m;row++) {
            for(int col=1;col<n;col++) {
                if(matrix[row][col] == 0) {
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        for(int row=1;row<m;row++) {
            if(matrix[row][0]==0) {
                for(int col=0;col<n;col++) {
                    matrix[row][col]=0;
                }
            }
        }

        for(int col=0;col<n;col++) {
            if(matrix[0][col]==0) {
                for(int row=0;row<m;row++) {
                    matrix[row][col]=0;
                }
            }
        }

        if(rowZero) {
            for(int row=0;row<m;row++) {
                matrix[row][0]=0;
            }
        }

        if(colZero) {
            for(int col=0;col<n;col++) {
                matrix[0][col]=0;
            }
        }
    }
}