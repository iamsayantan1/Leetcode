class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][];
        for(int row=0;row<numRows;row++) {
            pascal[row] = new int[row+1];
            pascal[row][0] = 1;
            pascal[row][row] = 1;
        }

        for(int row=2;row<numRows;row++) {
            for(int col=1;col<row;col++) {
                pascal[row][col] = pascal[row-1][col] + pascal[row-1][col-1];
            }
        }

        List<List<Integer>> pascalTri = new ArrayList<>();
        for(int row=0;row<numRows;row++) {
            List<Integer> innerArr = new ArrayList<>();
            for(int col=0;col<=row;col++) {
                innerArr.add(pascal[row][col]);
            }
            pascalTri.add(innerArr);
        }

        return pascalTri;
    }
}