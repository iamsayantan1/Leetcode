class Solution {
    public int pivotIndex(int[] nums) {
        int lSum=0, rSum=0;

        for(int index=1; index<nums.length; index++) {
            rSum += nums[index];
        }

        if(lSum == rSum) return 0;
        for(int index=1; index<nums.length; index++) {
            lSum += nums[index-1];
            rSum -= nums[index];

            if(lSum == rSum) {
                return index;
            }
        }

        return -1;
    }
}