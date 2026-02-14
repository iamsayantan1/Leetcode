class Solution {
    public void sortColors(int[] nums) {
        int noOfZ = 0;
        for (int z:nums) {
            if (z==0) {
                noOfZ++;
            }
        }

        int l=0;
        int r=nums.length-1;
        int m=noOfZ;

        while(l<=m && m<=r) {
            if(nums[m] > 1) {
                swap(nums,m,r);
                r--;
            }
            else if(nums[m] < 1) {
                swap(nums,m,l);
                l++;
            }
            else {
                m++;
            }
        }
    }

    void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}