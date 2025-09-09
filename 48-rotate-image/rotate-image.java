class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        // copy matrix
        int[][] tempm = Arrays.stream(matrix)
            .map(row -> row.clone())
            .toArray(s -> matrix.clone());
        
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len ; j++) {
                matrix[i][j] = tempm[len-1-j][i];
            }
        }
    }
}