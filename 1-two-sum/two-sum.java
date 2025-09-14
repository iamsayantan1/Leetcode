class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arrLen = nums.length;
        int[] sortedArr = Arrays.copyOf(nums,arrLen);
        Arrays.sort(sortedArr);

        int i=0;
        int j=arrLen-1;

        while(i<j) {
            if(sortedArr[i]+sortedArr[j] == target) {
                break;
            }
            else if(sortedArr[i]+sortedArr[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }

        int fIdx=-1;
        int sIdx=-1;

        for(int index=0;index<arrLen;index++) {
            if(fIdx == -1 && nums[index] == sortedArr[i]) {
                fIdx = index;
            }
            else if(sIdx == -1 && nums[index] == sortedArr[j]) {
                sIdx = index;
            }
        }

        return new int[]{fIdx,sIdx};
    }
}