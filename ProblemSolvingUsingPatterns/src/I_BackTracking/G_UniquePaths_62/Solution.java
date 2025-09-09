
package I_BackTracking.G_UniquePaths_62;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int paths = uniquePaths(3,7);
        System.out.println(paths);
    }
    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return backtrack(0, 0, m, n, memo);
    }

    private static int backtrack(int row, int col, int m, int n, int[][] memo) {
        if (row == m - 1 && col == n - 1) return 1;

        if (row >= m || col >= n) return 0;

        if (memo[row][col] != -1) return memo[row][col];

        int down = backtrack(row + 1, col, m, n, memo);
        int right = backtrack(row, col + 1, m, n, memo);

        memo[row][col] = down + right;
        return down + right;
    }
}
