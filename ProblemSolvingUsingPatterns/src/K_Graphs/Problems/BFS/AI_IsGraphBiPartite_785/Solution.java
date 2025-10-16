package K_Graphs.Problems.BFS.AI_IsGraphBiPartite_785;

import java.util.*;

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

        List<List<Integer>> getAdjList(){
            return this.adj;
        }

        void addEdge(int u, int v){
            this.adj.get(u).add(v);
            this.adj.get(v).add(u); // since undirectional;
        }
    }
    public boolean isBipartite(int[][] graph) {

        GraphList graphList = new GraphList(graph.length);
        
        for(int i = 0;i<graph.length;i++){

            int[] indexConnections = graph[i];

            for(int j = 0;j<indexConnections.length;j++){
                graphList.addEdge(i,indexConnections[j]);
            }
        }

        int[] colourFilledIndex = new int[graph.length];
        Arrays.fill(colourFilledIndex,-1);
        List<List<Integer>> adjList = graphList.getAdjList();
        
        for (int i = 0; i < graph.length; i++) {
            if (colourFilledIndex[i] == -1) {
                if (!bfsTraversal(graph.length,adjList, i, colourFilledIndex))
                    return false;
            }
        }

        return true;
    }

    public boolean bfsTraversal(int v, List<List<Integer>> adjList, int start,int[] colourFilledIndex){

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        colourFilledIndex[start] = 1;


        while(!queue.isEmpty()){

            int currentNode = queue.poll();

            for(int neighbour : adjList.get(currentNode)){

                if(colourFilledIndex[neighbour] == -1){
                    colourFilledIndex[neighbour] = colourFilledIndex[currentNode] == 0 ? 1 : 0;
                    queue.offer(neighbour);
                } else if (colourFilledIndex[neighbour] == colourFilledIndex[currentNode]){
                    return false;
                }
            }

        }

        return true;
    }
}