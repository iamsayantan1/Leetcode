class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int start=0;
        long sum=0,maxsum=0;
        Set<Integer> set = new HashSet<>();

        for(int end=0; end<nums.length; end++) {
            while(set.contains(nums[end])) {
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }

            sum += nums[end];
            set.add(nums[end]);

            if(end-start+1 == k) {
                maxsum = maxsum>sum ? maxsum : sum;
                sum -= nums[start];
                set.remove(nums[start]);
                start++;
            }
        }

        return maxsum;
    }
}