class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;

        int[] out = new int[len];
        int left = -1, right = len;
        // Find mid
        for(int index=0;index<len;index++) {
            if(nums[index]<0) {
                left=index;
            }
            else {
                right=index;
                break;
            }
        }
        
        int index=0;
        while(left != -1 || right != len) {
            if(left == -1) {
                out[index++] = nums[right]*nums[right];
                right++;
            }
            else if(right == len) {
                out[index++] = nums[left]*nums[left];
                left--;
            }
            else {
                if(Math.abs(nums[left])<nums[right]) {
                    out[index++] = nums[left]*nums[left];
                    left--;
                }
                else {
                    out[index++] = nums[right]*nums[right];
                    right++;
                }
            }
        }

        return out;
    }
}