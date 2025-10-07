class Solution {
    public int arraySign(int[] nums) {
        boolean isZero = Arrays.stream(nums).anyMatch(x -> x==0);
        if (isZero) {
            return 0;
        }
        
        long negative = Arrays.stream(nums).filter(x -> x<0).count();
        
        return  (negative%2 == 0) ? 1 : -1;
    }
}