class Solution {
    public int[] plusOne(int[] digits) {
        for(int index=digits.length-1; index>=0; index--) {
            if(digits[index] != 9) {
                digits[index] += 1;
                return digits;
            }
            else {
                digits[index] = 0;
            }
        }

        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
}