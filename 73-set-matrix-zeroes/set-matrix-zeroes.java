class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        int colLen = matrix.length;
        int rowLen = colLen!=0 ? matrix[0].length : 0;

        for(int colNo=0 ; colNo<colLen ; colNo++) {
            for(int rowNo=0 ; rowNo<rowLen ; rowNo++) {
                if(matrix[colNo][rowNo] == 0) {
                    rows.add(rowNo);
                    cols.add(colNo);
                }
            }
        }

        for(int col : cols) {
            for(int rowNo=0 ; rowNo<rowLen ; rowNo++) {
                matrix[col][rowNo] = 0;
            }
        }

        for(int row : rows) {
            for(int colNo=0 ; colNo<colLen ; colNo++) {
                matrix[colNo][row] = 0;
            }
        }
    }
}