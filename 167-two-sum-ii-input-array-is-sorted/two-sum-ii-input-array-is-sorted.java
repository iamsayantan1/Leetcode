class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0; 
        int right=numbers.length-1;

        while(left<right) {
            if(target-numbers[right] > numbers[left]) {
                left++;
            }
            else if(target-numbers[right] < numbers[left]) {
                right--;
            }
            else {
                return new int[]{left+1,right+1};
            }
        }

        return new int[]{0,0};
    }
}