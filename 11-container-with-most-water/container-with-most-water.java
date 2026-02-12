class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int maxArea=0;

        while(left<right) {
            int minHight = Math.min(height[left],height[right]);
            int distance = right-left;
            int currentArea = minHight*distance;
            maxArea = Math.max(currentArea,maxArea);

            if(minHight == height[left]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;
    }
}