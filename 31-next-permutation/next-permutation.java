class Solution {
    public void nextPermutation(int[] nums) {
        int arrLen = nums.length;
        int pivot=-1;

        for(int index=arrLen-2 ; index>=0 ; index--) {
            if(nums[index] < nums[index+1]) {
                pivot=index;
                break;
            }
        }

        if(pivot >= 0) {
            for(int index=arrLen-1 ; index>pivot ; index--) {
                if(nums[index] > nums[pivot]) {
                    swap(nums, index, pivot);
                    break;
                }
            }

            rotateArr(nums, pivot+1);
        }
        else {
            rotateArr(nums, 0);
        }
    }

    private void rotateArr(int[] arr, int start) {
        int i=start;
        int j=arr.length-1;

        while(i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] arr, int l1, int l2) {
        int temp = arr[l1];
        arr[l1] = arr[l2];
        arr[l2] = temp;
    }
}