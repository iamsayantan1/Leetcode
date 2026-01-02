class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length>1) {
            int i=0,j=1;
            while(nums.length>i && nums.length>j) {
                if(nums[i] != 0) {
                    i++;
                }
                else if(nums[j] == 0 || j<i) {
                    j++;
                }
                else {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    i++;
                    j++;
                }
            }
        }
    }
}