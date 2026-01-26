class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;

        while(start<end) {
            char sChar = s.charAt(start);
            char eChar = s.charAt(end);

            if(Character.isLetterOrDigit(sChar) && Character.isLetterOrDigit(eChar)) {
                if(Character.toLowerCase(sChar) != Character.toLowerCase(eChar)) {
                    return false;
                }

                start++;
                end--;
            }
            else if(Character.isLetterOrDigit(sChar)) {
                end--;
            }
            else {
                start++;
            }
        }

        return true;
    }
}