class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;

        for(int right=0;right<nums.length;right++) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            if(nums[left] != val) {
                left++;
            }
        }

        return left;
    }
}