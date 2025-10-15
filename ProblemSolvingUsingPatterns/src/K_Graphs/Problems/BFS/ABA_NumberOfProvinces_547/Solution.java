package K_Graphs.Problems.BFS.ABA_NumberOfProvinces_547;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0;i<n;i++){

            if(!visited[i]){
                bfsTraversal(isConnected,i,visited);
                count++;
            }
        }

        

        return count;
    }

     public void bfsTraversal(int[][] isConnected, int start, boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){

            int node = queue.poll();

            for(int i = 0;i<isConnected.length;i++){
                if(isConnected[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
     }
}