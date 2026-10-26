class Solution {
    public int singleNumber(int[] nums) {
        int except_number = 0;
        for(int i = 0; i < nums.length; i++) {
            except_number ^= nums[i];
        }

        return except_number;
    }
}
