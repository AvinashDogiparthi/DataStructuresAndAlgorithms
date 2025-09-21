package J_Tree.Problems.AF_PopulatingNextRightPointersInEachNode_116;/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import J_Tree.Problems.Node;

import java.util.LinkedList;
import java.util.Queue;

class SolutionUsingQueueNotSpaceOptimized {
    public Node connect(Node root) {
        
        if(root == null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            Node previous = null;

            for(int i = 0;i<levelSize;i++){

                Node node = queue.poll();

                if(previous != null){
                    previous.next = node;
                }

                previous = node;

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }

            previous.next = null;            
        }

        return root;
    }
}