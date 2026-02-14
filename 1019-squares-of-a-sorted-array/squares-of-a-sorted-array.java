class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;

        int[] out = new int[len];
        int left = 0, right = len-1;
        
        int index = len-1;
        while(left<=right) {
            if(-1*nums[left]>nums[right]) {
                out[index--] = nums[left]*nums[left];
                left++;
            }
            else {
                out[index--] = nums[right]*nums[right];
                right--;
            }
        }

        return out;
    }
}