class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0, e=0, sum=0, size=0;
        boolean sizeFound=false;

        while(e<nums.length) {
            while(target>sum && e<nums.length) {
                sum += nums[e];
                e++;
            }

            while(target<=sum) {
                sizeFound = true;
                sum -= nums[s];
                s++;
            }

            if(sizeFound) {
                if(size == 0) {
                    size = e-s+1;
                }
                else {
                    int currSize = e-s+1;
                    size = Math.min(currSize,size);
                }
            }
        }

        return size;
    }
}