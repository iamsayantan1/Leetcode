class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxss = 0;
        int left=0;

        Map<Character,Integer> seen = new HashMap<>();
        
        for(int right=0;right<len;right++) {
            char ch = s.charAt(right);

            if(seen.containsKey(ch)) {
                left = Math.max(left,seen.get(ch)+1);
            }

            seen.put(ch,right);
            maxss = Math.max(maxss,right-left+1);
        }

        return maxss;
    }
}