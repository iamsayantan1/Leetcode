class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0, j=height.length-1;

        while(i<j) {
            int minValIdx = Math.min(height[i],height[j]);
            int val = minValIdx * (j-i);
            
            if(max < val) {
                max = val;
            }

            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }
}