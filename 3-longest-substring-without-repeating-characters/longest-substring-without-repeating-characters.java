class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0, maxsize=0, currsize=0;
        Set<Character> set = new HashSet<>();

        for(int end=0; end<s.length(); end++) {
            char currCh = s.charAt(end);
            while(set.contains(currCh)) {
                set.remove(s.charAt(start));
                currsize--;
                start++;
            }
            set.add(currCh);
            currsize++;
            maxsize = Integer.max(maxsize,currsize);
        }

        return maxsize;
    }
}