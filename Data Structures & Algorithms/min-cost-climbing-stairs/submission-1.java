class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] min_costs = new int[cost.length + 1];
        min_costs[0]  = 0;
        min_costs[1] = 0;

        for(int i = 2; i <= cost.length; i++) {
            min_costs[i] = Math.min(min_costs[i - 1] + cost[i - 1], min_costs[i - 2] + cost[i - 2]);
        }

        return min_costs[cost.length];
    }
}
