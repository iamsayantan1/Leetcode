class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums != null && nums.length>1) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int index=0; index<nums.length; index++) {
                map.put(nums[index],index);
            }

            for(int index=0; index<nums.length; index++) {
                if(map.containsKey(target-nums[index]) && map.get(target-nums[index]) != index) {
                    return new int[]{index,map.get(target-nums[index])};
                }
            }
        }
        return new int[]{-1,-1};
    }
}