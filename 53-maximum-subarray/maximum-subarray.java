class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int len = nums.length;

        for(int i=0 ; i<len ; i++) {
            if(sum<0) {
                sum=0;
            }

            sum += nums[i];

            if(max<sum) {
                max = sum;
            }
        }

        if(max<=0) {
            for(int i=0 ; i<len ; i++) {
                if(max<nums[i]) {
                    max = nums[i];
                }
            }
        }

        return max;
    }
}