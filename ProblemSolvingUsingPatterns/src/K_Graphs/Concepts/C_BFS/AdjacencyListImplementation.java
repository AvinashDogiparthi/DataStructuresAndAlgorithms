package K_Graphs.Concepts.C_BFS;

import java.util.*;

public class AdjacencyListImplementation {

    // Time Complexity : O(V + E)
    // Space Complexity : O(V)
    static void bfsTraversal(int v, List<List<Integer>> adj, int start, boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        System.out.println("BFS Traversal : ");

        while(!queue.isEmpty()){
            int node = queue.poll();

            System.out.print(node+" ");

            for(int neighbour : adj.get(node)){

                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // when there are no disconnected nodes
        int v = 5;
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[v];

        for (int i = 0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).addAll(Arrays.asList(1,2));
        adj.get(1).addAll(Arrays.asList(0,3));
        adj.get(2).addAll(Arrays.asList(0,4));
        adj.get(3).add(1);
        adj.get(4).add(2);

        bfsTraversal(v,adj,0,visited);

        System.out.println("-------------------------------");

        // when there are disconnected nodes
        int v2 = 7;
        List<List<Integer>> adj2 = new ArrayList<>();
        boolean[] visited2 = new boolean[v2];

        for (int i = 0;i<v2;i++){
            adj2.add(new ArrayList<>());
        }

        adj2.get(0).addAll(Arrays.asList(1,2));
        adj2.get(1).addAll(Arrays.asList(0,3));
        adj2.get(2).addAll(Arrays.asList(0,4));
        adj2.get(3).add(1);
        adj2.get(4).add(2);
        adj2.get(5).add(6);
        adj2.get(6).add(5);

        for(int i = 0;i<v2;i++){
            if(!visited2[i]){
                bfsTraversal(v2,adj2,i,visited2);
            }
        }

    }
}
