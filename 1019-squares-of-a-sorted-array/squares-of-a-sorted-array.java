class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left=nums.length-1, right=nums.length;
        for(int index=0 ; index<nums.length ; index++) {
            if(nums[index] >= 0) {
                left = index-1;
                right = index;
                break;
            }
        }

        int resultIdx=0;
        while(left != -1 || right != nums.length) {
            if(left != -1 && right != nums.length) {
                if(-1*nums[left] > nums[right]) {
                    result[resultIdx++] = nums[right]*nums[right];
                    right++;
                }
                else {
                    result[resultIdx++] = nums[left]*nums[left];
                    left--;
                }
            }
            else if(left != -1) {
                result[resultIdx++] = nums[left]*nums[left];
                left--;
            }
            else {
                result[resultIdx++] = nums[right]*nums[right];
                right++;
            }
        }

        return result;
    }
}