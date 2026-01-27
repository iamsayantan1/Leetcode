class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1) {
            slow = sumOfSqrs(slow);
            fast = sumOfSqrs(sumOfSqrs(fast));

            if(slow == fast && fast != 1) {
                return false;
            }
        }

        return true;
    }

    int sumOfSqrs(int num) {
        int sum=0;
        while(num != 0) {
            sum+=((num%10)*(num%10));
            num/=10;
        }
        return sum;
    }
}