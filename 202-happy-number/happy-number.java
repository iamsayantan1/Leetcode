class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();

        while(n!=1) {
            if(visited.contains(n)) {
                return false;
            }
            visited.add(n);
            n = sumOfSqrs(n);
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