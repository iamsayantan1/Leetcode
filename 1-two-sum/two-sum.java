class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int index=0; index<nums.length; index++) {
            int need = target-nums[index];

            if(map.containsKey(need)) {
                return new int[]{index,map.get(need)};
            }

            map.put(nums[index],index);
        }
        return new int[]{-1,-1};
    }
}