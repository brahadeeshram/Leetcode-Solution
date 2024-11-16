
public class dungeon {
    public static void main(String[] args) {
        int[][] dungeon={
            {-2,-3,3},
            {-5,-10,1},
            {10,30,-5}
        };
        System.out.println(calculateMinimumHP(dungeon));
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        
        // Create a DP table with the same dimensions as the dungeon
        int[][] dp = new int[m][n];
        
        // Start filling the DP table from the bottom-right corner
        // Bottom-right cell
        dp[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
        
        // Fill the last row
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - dungeon[i][n - 1]);
        }
        
        // Fill the last column
        for (int j = n - 2; j >= 0; j--) {
            dp[m - 1][j] = Math.max(1, dp[m - 1][j + 1] - dungeon[m - 1][j]);
        }
        
        // Fill the rest of the DP table
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int minHealthOnExit = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(1, minHealthOnExit - dungeon[i][j]);
            }
        }
        
        // The top-left cell contains the minimum initial health needed
        return dp[0][0];
    }
}
