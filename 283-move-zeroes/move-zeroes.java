class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPos=0;
        for(int num : nums) {
            if(num != 0) {
                nums[zeroPos++] = num;
            }
        }

        while(zeroPos < nums.length) {
            nums[zeroPos++] = 0;
        }
    }
}