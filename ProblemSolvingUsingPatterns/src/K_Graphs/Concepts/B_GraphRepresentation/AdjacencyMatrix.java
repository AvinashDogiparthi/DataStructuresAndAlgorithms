package K_Graphs.Concepts.B_GraphRepresentation;

import java.util.Arrays;

public class AdjacencyMatrix {

    // Space Complexity : O(V*V)
    // Add Edge : O(1)
    // Check Edge : O(1)
    // Good for dense graphs ( many edges )
    public static void main(String[] args) {
        int v = 4; // number of vertices
        int[][] adjMatrix = new int[v][v];

        addEdge(adjMatrix,0,1);
        addEdge(adjMatrix,1,2);
        addEdge(adjMatrix,1,3);
        addEdge(adjMatrix,0,3);


        printMatrix(adjMatrix);
    }

    static void addEdge(int[][] matrix, int u, int v){
        matrix[u][v] = 1;
        matrix[v][u] = 1; // since undirected
    }

    static void printMatrix(int[][] matrix){

        System.out.println("Adjacency Matrix:");

        for(int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }
}
