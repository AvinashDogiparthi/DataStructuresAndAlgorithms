package K_Graphs.Concepts.B_GraphRepresentation;

public class AdjacencyList {

    public static void main(String[] args) {

        GraphList graphList = new GraphList(4);
        graphList.addEdge(0,1);
        graphList.addEdge(1,2);
        graphList.addEdge(1,3);
        graphList.addEdge(0,3);
        graphList.printGraph();
    }
}
