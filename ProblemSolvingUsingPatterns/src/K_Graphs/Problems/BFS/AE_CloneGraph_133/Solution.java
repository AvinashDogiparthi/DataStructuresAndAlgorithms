package K_Graphs.Problems.BFS.AE_CloneGraph_133;/*

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    public Node cloneGraph(Node node) {

        if(node == null) return null;

        Map<Node,Node> mapOfNodes = new HashMap<>();

        Node clonedNode = new Node(node.val);
        mapOfNodes.put(node,clonedNode);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){

            Node current = queue.poll();


            for(Node iterativeNode : current.neighbors){

                if(!mapOfNodes.containsKey(iterativeNode)){

                    mapOfNodes.put(iterativeNode,new Node(iterativeNode.val));
                    queue.offer(iterativeNode);
                }

                mapOfNodes.get(current).neighbors.add(mapOfNodes.get(iterativeNode));
            }
        }

        return clonedNode;
        
    }
}