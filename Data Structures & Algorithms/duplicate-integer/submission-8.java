class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sort = new HashSet<Integer>();
        for (int num : nums){
            if(!sort.add(num)) return true;
        }
        return false;
    }
}