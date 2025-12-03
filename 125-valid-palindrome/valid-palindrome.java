class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return false;
        int left=0,right=s.length()-1;

        while(left<right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            char rightChar = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if(leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}