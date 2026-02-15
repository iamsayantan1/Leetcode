class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minss=Integer.MAX_VALUE;
        int sum=0;

        for(int right=0; right<nums.length; right++) {
            sum+=nums[right];
            while(target<=sum) {
                minss = Math.min(minss,right-left+1);
                sum-=nums[left++];
            }
        }

        return minss==Integer.MAX_VALUE ? 0 : minss;
    }
}