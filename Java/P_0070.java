////// 1. Plain Recursion (TLE for large n)
// Time: Exponential | Space: O(n) - call stack
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}





///// 2. Recursion + Memoization (Top-Down DP)
// Time: O(n) | Space: O(n) - call stack + memo array
class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (n <= 1) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}




////// 3. Bottom-Up DP (Tabulation)
// Time: O(n) | Space: O(n)
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}





/////// 4. Optimized Bottom-Up DP (Constant Space)
// Time: O(n) | Space: O(1)
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
