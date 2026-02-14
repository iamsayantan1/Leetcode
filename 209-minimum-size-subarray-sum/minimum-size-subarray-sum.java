class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int right=0;
        int sum=0;

        for(int left=0;left<nums.length;left++) {
            while(right<nums.length && sum<target) {
                sum += nums[right++];
            }

            if(sum>=target) {
                min = Math.min(min,right-left);
            }
            sum -= nums[left];
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}