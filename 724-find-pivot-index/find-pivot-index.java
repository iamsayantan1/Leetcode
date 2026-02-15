class Solution {
    public int pivotIndex(int[] nums) {

        if(nums.length==1) {
            return 0;
        }

        int leftSum=0;
        int rightSum=0;

        for(int index=1;index<nums.length;index++) {
            rightSum += nums[index];
        }

        int index=0;
        do {
            if(leftSum == rightSum) {
                return index;
            }
            else {
                leftSum += nums[index];
                rightSum -= nums[index+1];
            }
            index++;
        }
        while (index<nums.length-1);

        return leftSum == rightSum ? index:-1;
    }
}