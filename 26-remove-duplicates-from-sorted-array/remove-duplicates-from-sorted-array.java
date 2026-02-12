class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int index=1 ; index<nums.length ; index++) {
            if(nums[left] != nums[index]) {
                nums[++left] = nums[index];
            }
        }
        return left+1;
    }
}