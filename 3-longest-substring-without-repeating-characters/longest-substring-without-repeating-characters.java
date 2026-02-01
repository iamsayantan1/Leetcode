class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0, maxsize=0;
        Set<Character> set = new HashSet<>();

        for(int end=0; end<s.length(); end++) {
            char currCh = s.charAt(end);
            while(set.contains(currCh)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currCh);
            maxsize = Integer.max(maxsize,end-start+1);
        }

        return maxsize;
    }
}