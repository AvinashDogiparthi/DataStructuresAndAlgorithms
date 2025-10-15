package K_Graphs.Problems.BFS.AB_NumberOfIslands_200;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        
        int rows = grid.length;
        int columns = grid[0].length;

        int count = 0;
        boolean[][] visited = new boolean[rows][columns];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){

                if(grid[i][j] == '1' && !visited[i][j]){
                    bfsTraversal(grid,i,j,visited);
                    count++;
                }
            }
        }

        return count;
    }

    private static void bfsTraversal(char[][] grid, int i, int j,boolean[][] visited){

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()){

            int[] cell = queue.poll();

            int x = cell[0];
            int y = cell[1];

            for(int[] direction : directions){

                int dx = x + direction[0];
                int dy = y + direction[1];

                if(dx >= 0 && dy >= 0 && dx < grid.length && dy < grid[0].length && grid[dx][dy] == '1' && !visited[dx][dy]){

                    visited[dx][dy] = true;
                    queue.offer(new int[]{dx,dy});
                }
            }
        }
    }
}