class Solution {
    public int hammingWeight(int n) {
        int one_bit_count = 0;
        while(n > 0) {
            one_bit_count += n % 2;
            n >>= 1;
        }

        return one_bit_count;
    }
}
