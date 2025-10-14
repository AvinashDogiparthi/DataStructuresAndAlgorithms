package K_Graphs.Concepts.C_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrixImplementation {

    static void bfsTraversal(int[][] graph, int start){

        boolean[] visited  = new boolean[graph.length];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){

            int node = queue.poll();
            System.out.print(node + " ");

            for(int i = 0;i<graph.length;i++){

                if(graph[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}
