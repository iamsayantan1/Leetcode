class Solution {
    public int maximumCount(int[] nums) {
        int pos = nums.length - upperBound(nums);
        int neg = lowerBound(nums);

        return Math.max(pos,neg);
    }

    private int lowerBound(int[] a) {
        int s=0;
        int e=a.length-1;
        int m=0;
        int index=a.length;

        while(e>=s) {
            m=(e+s)/2;
            if(a[m]>=0) {
                e=m-1;
                index=m;
            }
            else {
                s=m+1;
            }
        }

        return index;
    }

    private int upperBound(int[] a) {
        int s=0;
        int e=a.length-1;
        int m=0;
        int index=a.length;

        while(e>=s) {
            m=(e+s)/2;
            if(a[m]<=0) {
                s=m+1;
            }
            else {
                e=m-1;;
                index=m;
            }
        }

        return index;
    }
}