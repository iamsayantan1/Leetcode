class Solution {
    public int removeElement(int[] nums, int val) {
        int fast=0;
        int slow=0;

        while(fast<nums.length) {
            if(nums[fast] == val) {
                fast++;
                continue;
            }

            nums[slow++] = nums[fast++];
        }

        return slow;
    }
}