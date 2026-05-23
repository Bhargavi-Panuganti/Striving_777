class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);
        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;

        return solve(coins, amount, dp);
    }

    public int solve(int[] coins, int amount, int[][] dp) {
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    int take = dp[i][j - coins[i - 1]];
                    if (take != Integer.MAX_VALUE) // ✅ overflow check
                        dp[i][j] = Math.min(dp[i - 1][j], take + 1);
                    else
                        dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int ans = dp[coins.length][amount];
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}