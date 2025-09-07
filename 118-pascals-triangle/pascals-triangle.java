class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascalTriangle = new int[numRows][];

        for(int row=0 ; row<numRows ; row++) {
            int[] indexArr = new int[row+1];
            indexArr[0] = 1;
            indexArr[row] = 1;
            pascalTriangle[row] = indexArr;
        }

        if (numRows > 2) {
            for(int row=1 ; row<numRows ; row++) {
                for(int col=1 ; col<row ; col++) {
                    pascalTriangle[row][col] = pascalTriangle[row-1][col-1] + pascalTriangle[row-1][col];
                }
            }
        }

        List<List<Integer>> pascal = new ArrayList<>();

        for (int[] innerArr : pascalTriangle) {
            List<Integer> tempArr = new ArrayList<>();
            for (int elem : innerArr) {
                tempArr.add(elem);
            }
            pascal.add(tempArr);
        }

        return pascal;
    }
}