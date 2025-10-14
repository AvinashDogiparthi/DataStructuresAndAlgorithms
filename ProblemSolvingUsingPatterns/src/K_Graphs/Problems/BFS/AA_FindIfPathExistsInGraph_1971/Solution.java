package K_Graphs.Problems.BFS.AA_FindIfPathExistsInGraph_1971;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Time Complexity : O(V+E)
// Space Complexity : O(V+E)
class Solution {

    static class AdjancencyList{

        int v;
        List<List<Integer>> adj;

        AdjancencyList(int v){
            this.v = v;
            adj = new ArrayList<>();

            for(int i = 0;i<v;i++){
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v){
            this.adj.get(u).add(v);
            this.adj.get(v).add(u); // undirected graph
        }

        List<List<Integer>> getList(){
            return this.adj;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(source == destination) return true;
        
        AdjancencyList list = new AdjancencyList(n);
        for(int[] edge : edges){
            list.addEdge(edge[0],edge[1]);
        }

        boolean[] visited = new boolean[n];

        return bfsTraversal(n,list.getList(),source,visited,destination);
        
    }

    public boolean bfsTraversal(int n, List<List<Integer>> adj, int start, boolean[] visited, int destination){

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){

            int node = queue.poll();
            for(int neighbour : adj.get(node)){

                if(!visited[neighbour]){

                    if(neighbour == destination){
                        return true;
                    }

                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }

        return false;
        
    }
}