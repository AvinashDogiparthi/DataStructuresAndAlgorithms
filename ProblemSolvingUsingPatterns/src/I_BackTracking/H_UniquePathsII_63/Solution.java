package I_BackTracking.H_UniquePathsII_63;

import java.util.Arrays;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];

        for(int[] row:memo){
            Arrays.fill(row,-1);
        }

        return backtrack(obstacleGrid,0,0,m,n,memo);
    }

    private int backtrack(int[][] grid, int row, int col, int m, int n, int[][] memo) {
        
        if(row >= m || col >= n) return 0;

        if(memo[row][col] != -1) return memo[row][col];

        if(grid[row][col] == 1) return 0;

        if(row == m - 1 && col == n -1) return 1;

        int down = backtrack(grid,row+1,col,m,n,memo);
        int right = backtrack(grid,row,col+1,m,n,memo);

        memo[row][col] = down + right;

        return down + right;
    }
}
