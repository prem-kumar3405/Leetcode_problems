class Solution {
    Integer[][] dp;

    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length][2];
        return solve(prices, 0, 1);
    }

    private int solve(int[] prices, int i, int canBuy) {
        if (i == prices.length) return 0;

        if (dp[i][canBuy] != null) return dp[i][canBuy];

        int skip = solve(prices, i + 1, canBuy);
        int take;

        if (canBuy == 1) {
            take = solve(prices, i + 1, 0) - prices[i];
        } else {

            take = prices[i];
        }

        return dp[i][canBuy] = Math.max(skip, take);
    }
}