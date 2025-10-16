class Solution {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int s=0;
        int e=len-1;
        boolean hasZero = false;
        int mid=0;

        while(e>=s) {
            mid = (s+e+1)/2;
            if(nums[mid] == 0) {
                hasZero=true;
                break;
            }
            else if(nums[mid] < 0) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }

        if(nums[0]>0 || nums[len-1]<0) {
            return len;
        }

        if(hasZero) {
            s=e=mid;
            while(nums[s] == 0) {
                if(--s<0) {
                    break;
                }
            }

            while(nums[e] == 0) {
                if(++e==len) {
                    break;
                }
            }

            return Integer.max(s+1,len-e);
        }
        else {
            return Integer.max(s,len-1-e);
        }
    }
}