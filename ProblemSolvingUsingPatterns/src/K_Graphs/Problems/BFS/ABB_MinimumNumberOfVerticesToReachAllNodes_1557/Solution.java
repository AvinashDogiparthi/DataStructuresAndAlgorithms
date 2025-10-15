package K_Graphs.Problems.BFS.ABB_MinimumNumberOfVerticesToReachAllNodes_1557;

import java.util.ArrayList;
import java.util.List;

class Solution {

    static class GraphList{

        int v;
        List<List<Integer>> adj;
        

        GraphList(int v){
            this.v = v;
            adj = new ArrayList<>();

            for(int i = 0;i<v;i++){
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v){
            this.adj.get(u).add(v);
        }

        List<List<Integer>> getAdjList(){
            return this.adj;
        }
    }
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        GraphList graphList = new GraphList(n);

        for(List<Integer> edge : edges){
            graphList.addEdge(edge.get(0),edge.get(1));
        }

        List<List<Integer>> adjList = graphList.getAdjList();

        int[] inDegree = new int[n];
        for(int u = 0;u<n;u++){

            for(int v : adjList.get(u)){

                inDegree[v]++;
            }
        }

        // In a Directed Acyclic Graph, the smallest set of vertices that can reach all nodes are simply the nodes with zero incoming edges (in-degree = 0).
        // Those are the starting points of all paths.
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<n;i++){

            if(inDegree[i] == 0){
                result.add(i);
            }
        }

        return result;
    }
}