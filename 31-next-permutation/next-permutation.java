class Solution {
    public void nextPermutation(int[] nums) {
        int dip = -1;
        int len = nums.length;

        for(int i=len-2 ; i>=0 ; i--) {
            if(nums[i] < nums[i+1]) {
                dip = i;
                break;
            }
        }

        if(dip == -1) {
            reverse(nums, 0);
        }
        else {
            for(int i=len-1 ; i>dip ; i--) {
                if(nums[i] > nums[dip]) {
                    swap(nums, dip, i);
                    break;
                }
            }

            reverse(nums, dip+1);
        }
    }

    private void reverse(int[] arr, int stidx) {
        int s = stidx;
        int e = arr.length-1;

        while(e>s) {
            swap(arr,s,e);
            e--;
            s++;
        }
    }

    private void swap(int[] arr, int fidx, int sidx) {
        int temp = arr[fidx];
        arr[fidx] = arr[sidx];
        arr[sidx] = temp;
    }
}