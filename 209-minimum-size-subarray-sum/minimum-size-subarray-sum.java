class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int right=0;
        int currMin=0;
        int sum=0;

        for(int left=0;left<nums.length;left++) {
            while(right<nums.length && sum<target) {
                currMin++;
                sum += nums[right++];
            }

            if(sum>=target) {
                min = Math.min(min,currMin);
            }
            sum -= nums[left];
            currMin--;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}