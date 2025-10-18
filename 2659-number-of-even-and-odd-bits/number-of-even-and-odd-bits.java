class Solution {
    public int[] evenOddBit(int n) {
        int[] result = new int[2]; // result[0] = even, result[1] = odd
        int pos = 0;
        while (n > 0) {
            result[pos % 2] += n & 1;
            n >>= 1;
            pos++;
        }
        return result;
    }
}