class Solution {
    public void sortColors(int[] nums) {
        int nze=0;

        for(int index=nze ; index<nums.length ; index++) {
            if(nums[index] == 0) {
                swap(nums, nze, index);
                nze++;
            }
        }

        for(int index=nze ; index<nums.length ; index++) {
            if(nums[index] == 1) {
                swap(nums, nze, index);
                nze++;
            }
        }
    }

    private void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}