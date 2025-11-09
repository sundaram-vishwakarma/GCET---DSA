//////// Recursive - TLE
class Solution {
    private int way(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            return 1; // Reached destination
        }
        if (i >= m || j >= n) {
            return 0; // Out of bounds
        }
        return way(i + 1, j, m, n) + way(i, j + 1, m, n);
        
    }

    public int uniquePaths(int m, int n) {
        return way(0, 0, m, n);
    }
}





//////// Recursive + Memoized DP == TOP-DOWN
class Solution {
    private int[][] dp;

    private int way(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            return 1; // Reached destination
        }
        if (i >= m || j >= n) {
            return 0; // Out of bounds
        }
        if (dp[i][j] != -1) {
            return dp[i][j]; // Return memoized result
        }
        dp[i][j] = way(i + 1, j, m, n) + way(i, j + 1, m, n);
        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return way(0, 0, m, n);
    }
}






///// Recursive == BOTTOM-UP
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        
        for (int i=0; i<m; i++) {
            grid[i][0] = 1;
        }

        for (int j=0; j<n; j++) {
            grid[0][j] = 1;
        }

        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }

        return grid[m-1][n-1];
    }
}
