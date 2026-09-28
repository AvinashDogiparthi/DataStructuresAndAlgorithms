package J_Tree.Problems.DFS.ATA_N_ary_PreOrderTraversal_589;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        preOrder(root);
        return list;
    }

    public void preOrder(Node node){
        if(node == null){
            return;
        }

        list.add(node.val);


        for(Node n : node.children){
            preOrder(n);
        }
    }
}