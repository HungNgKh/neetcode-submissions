class Solution {
    public int search(int[] nums, int target) {
        int start_idx = 0;
        int end_idx = nums.length - 1;


        while(start_idx <= end_idx) {
            int splited_idx = start_idx + (end_idx - start_idx) / 2;
            if(nums[splited_idx] == target) {
                return splited_idx;
            } else if (nums[splited_idx] > target) {
                end_idx = splited_idx - 1;
            } else {
                start_idx = splited_idx + 1;
            }
        }

        return -1;
    }
}
