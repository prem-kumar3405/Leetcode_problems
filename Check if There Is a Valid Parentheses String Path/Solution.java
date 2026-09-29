 j, int balance, char[][] grid) {
        if (i >= n || j >= m) return false;

        if (grid[i][j] == '(') balance++;
        else balance--;

        if (balance < 0) return false;

        if (i == n - 1 && j == m - 1) {
            return balance == 0;
        }

        if (dp[i][j][balance] != null) {
            return dp[i][j][balance];
        }

        return dp[i][j][balance] =
            backtrack(i + 1, j, balance, grid) ||
            backtrack(i, j + 1, balance, grid);
    }
}