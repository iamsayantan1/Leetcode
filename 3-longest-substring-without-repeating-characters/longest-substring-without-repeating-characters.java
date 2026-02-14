class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxss = 0;
        int left=0,right=0;

        Set<Character> set = new HashSet<>();
        while(right<len) {
            char ch = s.charAt(right);
            if(!set.contains(ch)) {
                set.add(ch);
                maxss = Math.max(maxss,right-left+1);
                right++;
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxss;
    }
}