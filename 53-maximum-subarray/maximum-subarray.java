class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int index=0;index<nums.length;index++) {
            sum += nums[index];

            if(sum>max) {
                max=sum;
            }

            if(sum<0) {
                sum=0;
            }
        }

        return max;
    }
}