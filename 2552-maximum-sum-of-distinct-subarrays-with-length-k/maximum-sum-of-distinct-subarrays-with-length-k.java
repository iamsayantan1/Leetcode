class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long sum=0,maxsum=0;
        Map<Integer,Integer> freq = new HashMap<>();

        for(int right=0;right<nums.length;right++) {
            int rElem = nums[right];
            freq.put(rElem,freq.getOrDefault(rElem,0)+1);
            sum += rElem;
            if(right - left + 1 > k) {
                int lElem = nums[left++];
                freq.put(lElem,freq.get(lElem)-1);
                if (freq.get(lElem) == 0) {
                    freq.remove(lElem);
                }
                sum -= lElem;
            }
            
            if(k==right-left+1 && freq.size()==k) {
                maxsum = Math.max(maxsum,sum);
            }
        }

        return maxsum;
    }
}