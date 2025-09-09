class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] tempm = new int[len][len];

        // copy matrix
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len ; j++) {
                tempm[i][j] = matrix[i][j];
            }
        }
        
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len ; j++) {
                matrix[i][j] = tempm[len-1-j][i];
            }
        }
    }
}