class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int arrLen = intervals.length;
        int newArrLen = intervals.length;

        for (int i = 1; i < arrLen; i++) {
            if (intervals[i][0] <= intervals[i-1][1]) {
                intervals[i][0] = intervals[i-1][0];
                intervals[i][1] = Integer.max(intervals[i-1][1],intervals[i][1]);
                newArrLen--;
            }

        }

        int[][] mergedArr = new int[newArrLen][2];

        mergedArr[0][0] = intervals[0][0];
        mergedArr[0][1] = intervals[0][1];
        for (int i=1, j=0; i < arrLen; i++) {
            if (mergedArr[j][0] != intervals[i][0]) {
                j++;
            }
            mergedArr[j][0] = intervals[i][0];
            mergedArr[j][1] = intervals[i][1];
        }

        return mergedArr;
    }
}