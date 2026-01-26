class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int index=0;index<numbers.length;index++) {
            if(map.containsKey(target-numbers[index])) {
                return new int[]{map.get(target-numbers[index])+1,index+1};
            }

            map.put(numbers[index],index);
        }

        return new int[]{0,0};
    }
}