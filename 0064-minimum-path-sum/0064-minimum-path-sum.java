import java.util.*;

// Class containing the solution logic
class Solution {
    // Function to calculate minimum path sum with memoization
    public int minPath(int i, int j,
            int[][] grid, int[][] dp) {

        // If we are at (0,0), return that cell's value
        if (i == 0 && j == 0)
            return grid[0][0];

        // If out of bounds, return large number
        if (i < 0 || j < 0)
            return (int) 1e9;

        // If already computed, return from dp
        if (dp[i][j] != -1)
            return dp[i][j];

        // Compute path by going up
        int up = grid[i][j] +
                 minPath(i - 1, j, grid, dp);

        // Compute path by going left
        int left = grid[i][j] +
                   minPath(i, j - 1, grid, dp);

        // Store the minimum in dp and return
        return dp[i][j] = Math.min(up, left);
    }

    // Main function that initializes dp and calls helper
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Create dp table initialized with -1
        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Start from bottom-right corner
        return minPath(n - 1, m - 1, grid, dp);
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        int[][] grid = {
            {5, 9, 6},
            {11, 5, 2}
        };

        Solution obj = new Solution();
        System.out.println("Minimum sum path: "
            + obj.minPathSum(grid));
    }
}
