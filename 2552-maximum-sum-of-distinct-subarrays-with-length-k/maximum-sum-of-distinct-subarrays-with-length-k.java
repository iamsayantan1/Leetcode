class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long sum=0,maxsum=0;
        Set<Integer> set = new HashSet<>();

        for(int right=0;right<nums.length;right++) {
            int rElem = nums[right];

            while(set.contains(rElem) || right - left + 1 > k) {
                int lElem = nums[left++];
                sum -= lElem;
                set.remove(lElem);
            }

            set.add(rElem);
            sum += rElem;
            
            if(k==right-left+1) {
                maxsum = Math.max(maxsum,sum);
            }

            
        }

        return maxsum;
    }
}