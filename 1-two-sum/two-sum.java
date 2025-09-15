class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> memory = new HashMap<>();

        for(int index=0;index<nums.length;index++) {
            if(memory.containsKey(target-nums[index])) {
                return new int[]{index,memory.get(target-nums[index])};
            }

            memory.put(nums[index], index);
        }

        return new int[]{-1,-1};
    }
}
