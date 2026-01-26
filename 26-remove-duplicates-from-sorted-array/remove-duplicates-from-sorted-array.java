class Solution {
    public int removeDuplicates(int[] nums) {
      int slow=0;
      for(int index=1;index<nums.length;index++) {
        if(nums[slow] != nums[index]) {
            nums[++slow] = nums[index];
        }
      }

      return slow+1;
    }
}