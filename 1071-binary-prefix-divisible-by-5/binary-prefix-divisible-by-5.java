class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new LinkedList<>();

        int num=0;
        for(int bit : nums) {
            num = ((num<<1) + bit) % 5;
            res.add(num == 0);
        }

        return res;
    }
}