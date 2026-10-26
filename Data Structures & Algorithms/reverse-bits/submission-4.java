class Solution {
    public int reverseBits(int n) {
        int reversed = 0;
        
        for(int i = 0; i <= 31; i++) {
            int bit = (n >> (31 - i)) & 1;
            if(bit == 1) {
                reversed |= (1 << i);
            }
        }
        return reversed;
    }
}
