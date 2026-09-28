package J_Tree.Problems.BFS.AXC_MaximumDepthOfNaryTree_559;/*
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

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxDepth(Node root) {
        
        if(root == null){
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int levelsAvailable = 0;

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            for(int i = 0 ; i < levelSize;i++){

                Node current = queue.poll();

                for(Node n : current.children){
                    queue.offer(n);
                }
            }

            levelsAvailable = levelsAvailable + 1;
        }

        return levelsAvailable;
    }
}