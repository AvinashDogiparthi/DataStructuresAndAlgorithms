package J_Tree.Problems.BFS.AF_PopulatingNextRightPointersInEachNode_116;/*
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

class Solution {
    public Node connect(Node root) {

        if(root == null){
            return root;
        }

        Node leftMost = root;

        while(leftMost.left != null){

            Node current = leftMost;

            while(current != null){

                current.left.next = current.right;

                if(current.next != null){
                    current.right.next = current.next.left;
                }

                current = current.next;
            }
            
            leftMost = leftMost.left;
        }

        return root;
        
    }
}