class Solution {
    public int climbStairs(int n) {

        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        int[] step_ways = new int[n];

        step_ways[0] = 1;
        step_ways[1] = 2;

        int step = 2;

        while(step < n) {
            step_ways[step] = step_ways[step - 2] + step_ways[step - 1];
            step++;
        }

        return step_ways[n - 1];
    }
}
