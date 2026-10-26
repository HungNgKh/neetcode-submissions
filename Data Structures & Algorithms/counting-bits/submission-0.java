class Solution {
    public int[] countBits(int n) {
        
        int[] bit_counts = new int[n + 1];
        bit_counts[0] = 0;

        for(int i = 0; i < n + 1; i++) {
            if( i % 2 == 0) {
                bit_counts[i] = bit_counts[i / 2];
            } else {
                bit_counts[i] = bit_counts[i / 2] + 1;
            }
        }

        return bit_counts;
    }
}
