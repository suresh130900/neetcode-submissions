class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> test = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(test.containsKey(difference)){
                return new int[]{test.get(difference), i};
            }
            test.put(nums[i], i);
        }
        return new int[0];
    };
}
