class Solution {
    public boolean isHappy(int n) {
        int fastResult = n;
        int slowResult = n;
        do {
            fastResult = sumOfSqrs(sumOfSqrs(fastResult));
            slowResult = sumOfSqrs(slowResult);
        }
        while(fastResult != slowResult);

        return fastResult==1;
    }



    int sumOfSqrs(int n) {
        int sum=0;

        while(n != 0) {
            int rem = n%10;
            sum += rem*rem;
            n /= 10;
        }

        return sum;
    }
}