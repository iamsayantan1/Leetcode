class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new LinkedList<>();

        int remainder=0;
        for(int num : nums) {
            remainder = (remainder*2 + num) % 5;
            res.add(remainder%5 == 0);
        }

        return res;
    }
}