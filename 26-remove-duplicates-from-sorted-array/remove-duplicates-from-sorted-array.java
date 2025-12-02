class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int first=0,second=1,dec=0;

        while(second<nums.length) {
            if (nums[first] == nums[second]) {
                second++;
                dec++;
            }
            else {
                nums[first+1] = nums[second];
                first++;
                second++;
            }
        }

        return nums.length-dec;
    }
}