class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = next(slow);
            fast = next(next(fast));
        }
        while(slow != fast);

        return slow == 1;
    }

    int next(int num) {
        int sum=0;
        while(num > 0) {
            int d = num%10;
            sum += d*d;
            num /= 10;
        }
        return sum;
    }
}