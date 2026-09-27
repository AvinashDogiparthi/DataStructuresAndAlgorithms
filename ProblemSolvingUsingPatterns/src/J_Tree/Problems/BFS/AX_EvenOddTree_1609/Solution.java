package J_Tree.Problems.BFS.AX_EvenOddTree_1609;

import J_Tree.Problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        
        if(root == null){
            return false;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean isEvenLevel = true;

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            TreeNode previous = null;

            for(int i = 0;i<levelSize;i++){

                TreeNode current = queue.poll();

                if(isEvenLevel){
                    if(previous != null && previous.val >= current.val){
                        return false;
                    }

                    if(current.val % 2 == 0){
                        return false;
                    }
                } else {
                    if(previous != null && previous.val <= current.val){
                        return false;
                    }

                    if(current.val % 2 != 0){
                        return false;
                    }
                }

                previous = current;

                if(current.left != null){
                    queue.offer(current.left);
                }

                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            
            isEvenLevel = !isEvenLevel;
        }

        return true;
    }
}