class Solution {
    public int[] evenOddBit(int n) {
        int f = 0;
        int s = 0;
        int counter = 0;
        
        while(n!=0) {
            counter++;
            int bit = n%2;
            if(bit == 1) {
                if(counter%2 == 0) {
                    s++;
                }
                else {
                    f++;
                }
            }

            n = n>>1;
        }

        return new int[]{f,s};
    }
}