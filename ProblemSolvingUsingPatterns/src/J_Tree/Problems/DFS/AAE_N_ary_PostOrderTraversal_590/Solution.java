package J_Tree.Problems.DFS.AAE_N_ary_PostOrderTraversal_590;/*
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
}
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        postOrder(root);
        return list;
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }


        for(Node n : node.children){
            postOrder(n);
        }

        list.add(node.val);
    }
}