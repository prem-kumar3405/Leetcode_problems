class Solution {
    Integer dp[];
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new Integer[n];
        return Math.min(solve(cost, n - 1), solve(cost, n - 2));
    }

    public int solve(int[] cost, int index) {
        if (index < 0) {
            return 0;
        }
        if(dp[index]!=null) return dp[index];
        return dp[index]=cost[index] + Math.min(
            solve(cost, index - 1),
            solve(cost, index - 2)
        );
    }
}