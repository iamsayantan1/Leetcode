class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int index=0;index<numbers.length;index++) {
            int val = numbers[index];
            if(map.containsKey(target-val)) {
                return new int[]{map.get(target-val)+1,index+1};
            }

            map.put(val,index);
        }

        return new int[]{0,0};
    }
}