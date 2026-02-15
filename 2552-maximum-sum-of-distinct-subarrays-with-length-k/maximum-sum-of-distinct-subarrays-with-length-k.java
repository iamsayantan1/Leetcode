class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0, right=0;
        Set<Integer> set = new HashSet<>();
        long sum=0;
        long maxsum=0;

        while(right<nums.length) {
            int rElem = nums[right];
            sum += rElem;

            while(set.contains(rElem) || right-left+1>k) {
                int lElem = nums[left++];
                sum -= lElem;
                set.remove(lElem);
            }
            
            if(k==right-left+1) {
                maxsum = Math.max(maxsum,sum);
            }

            set.add(rElem);
            right++;
        }

        return maxsum;
    }
}