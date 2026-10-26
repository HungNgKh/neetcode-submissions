class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffs = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            diffs.put(target - nums[i], i);
        }

        int[] ret_array;

        for(int i = 0; i < nums.length; i++) {
            if(diffs.get(nums[i]) != null && i != diffs.get(nums[i])) {
                int diff_index = diffs.getOrDefault(nums[i], -1);

                ret_array = diff_index >= i ? new int[] {i, diff_index} : new int[] {diff_index, i};
                return ret_array;
            }
        }

        return new int[]{};

    }
}
