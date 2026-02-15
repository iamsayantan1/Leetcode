class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;

        for(int item:nums) {
            sum += item;
        }

        int leftSum=0;
        for(int index=0;index<nums.length;index++) {
            if(leftSum == sum - leftSum - nums[index]) {
                return index;
            }
            
            leftSum += nums[index];
        }

        return -1;
    }
}