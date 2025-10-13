package K_Graphs.Concepts.B_GraphRepresentation;

import java.util.ArrayList;
import java.util.List;

public class GraphList {

    private int V;
    private List<List<Integer>> adj;

    GraphList(int V){
        this.V = V;
        adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v){
        this.adj.get(u).add(v);
        this.adj.get(v).add(u); // for undirected graph
    }

    void printGraph(){

        for(int i = 0;i<V;i++){
            System.out.print(i+"->");
            for(int node : adj.get(i)){
                System.out.print(node+" ");
            }

            System.out.println();
        }
    }
}
