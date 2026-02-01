class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0, sum=0, size=Integer.MAX_VALUE;
        
        for(int e=0;e<nums.length;e++) {
            sum += nums[e];

            while(sum >= target) {
                size = Math.min(size,e-s+1);
                sum -= nums[s];
                s++;
            }
        }

        return size==Integer.MAX_VALUE ? 0 : size;
    }
}