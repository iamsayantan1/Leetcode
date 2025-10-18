class Solution {
    public int[] evenOddBit(int n) {
        char[] bitStr = Integer.toBinaryString(n).toCharArray();
        int even=0;
        int odd=0;
        int count=0;

        for(int idx=bitStr.length-1; idx>=0; idx--) {
            if (bitStr[idx] == '1') {
                if(count%2==0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            count++;
        }

        return new int[]{even,odd};
    }
}