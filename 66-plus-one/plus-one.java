class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length-1;

        if(digits[lastIndex] != 9) {
            digits[lastIndex] += 1;
            return digits;
        }
        else {
            digits[lastIndex] = 0;

            for(int index=lastIndex-1; index>=0; index--) {
                if(digits[index] == 9) {
                    digits[index] = 0;
                }
                else {
                    digits[index] += 1;
                    return digits;
                }
            }

            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
    }
}