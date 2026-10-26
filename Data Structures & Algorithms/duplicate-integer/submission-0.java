class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniq_values = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(uniq_values.contains(nums[i])) {
                return true;
            } else {
                uniq_values.add(nums[i]);
            }
        }

        return false;
    }
}