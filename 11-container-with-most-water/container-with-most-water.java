class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int maxWater = 0;
        int distance=right;
        while(left<right) {
            int lHeight = height[left];
            int rHeight = height[right];

            maxWater = Math.max(maxWater,Math.min(lHeight,rHeight)*distance);

            if(lHeight<rHeight) {
                left++;
            }
            else {
                right--;
            }
            distance--;
        }

        return maxWater;
    }
}