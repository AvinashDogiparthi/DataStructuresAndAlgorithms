package K_Graphs.Problems.BipartiteGraph.B_PossibleBipartition_886;

import java.util.*;

class Solution {

    static class GraphList {
        int v;
        List<List<Integer>> adj;

        GraphList(int v) {
            this.v = v;
            adj = new ArrayList<>();
            for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected
        }

        List<List<Integer>> getAdjList() {
            return adj;
        }
    }

    public boolean possibleBipartition(int n, int[][] dislikes) {
        GraphList graph = new GraphList(n + 1); // +1 because people are labeled from 1..n

        for (int[] d : dislikes) {
            graph.addEdge(d[0], d[1]);
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        List<List<Integer>> adj = graph.getAdjList();

        for (int i = 1; i <= n; i++) {
            if (color[i] == -1 && !bfsCheck(i, adj, color))
                return false;
        }
        return true;
    }

    private boolean bfsCheck(int start, List<List<Integer>> adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nei : adj.get(node)) {
                if (color[nei] == -1) {
                    color[nei] = 1 - color[node];
                    q.offer(nei);
                } else if (color[nei] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
