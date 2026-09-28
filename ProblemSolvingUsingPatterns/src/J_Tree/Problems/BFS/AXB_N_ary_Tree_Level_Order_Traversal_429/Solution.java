package J_Tree.Problems.BFS.AXB_N_ary_Tree_Level_Order_Traversal_429;/*
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
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        if(root == null){
            return new ArrayList<>();
        }


        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> result = new ArrayList<>();

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();

            for(int i = 0; i < levelSize;i++){

                Node current = queue.poll();
                levelValues.add(current.val);

                for(Node n : current.children){
                    queue.offer(n);
                }
            }

            result.add(levelValues);
        }

        return result;
    }
}