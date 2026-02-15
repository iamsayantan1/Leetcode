class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left=0;
        int maxss=0;
        int[] seen = new int[128];
        Arrays.fill(seen,-1);

        for(int right=0; right<len; right++) {
            char ch = s.charAt(right);
            if(seen[ch] != -1) {
                left = Math.max(left,seen[ch]+1);
            }

            maxss = Math.max(maxss,right-left+1);
            seen[ch] = right;
        }

        return maxss;
    }
}