class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;

        int[] out = new int[len];
        int left = 0, right = len-1;
        
        int index = len-1;
        while(left<=right) {
            int lftsqr = nums[left]*nums[left];
            int rgtsqr = nums[right]*nums[right];

            if(lftsqr>rgtsqr) {
                out[index--] = lftsqr;
                left++;
            }
            else {
                out[index--] = rgtsqr;
                right--;
            }
        }

        return out;
    }
}