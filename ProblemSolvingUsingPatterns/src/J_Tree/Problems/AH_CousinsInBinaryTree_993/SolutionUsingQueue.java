package J_Tree.Problems.AH_CousinsInBinaryTree_993;

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
class SolutionUsingQueue {
    public boolean isCousins(TreeNode root, int x, int y) {

        if(root == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            boolean foundX = false;
            boolean foundY = false;

            for(int i = 0;i<levelSize;i++){

                TreeNode node = queue.poll();

                if(node.val == x) foundX = true;
                if(node.val == y) foundY = true;

                if(node.left != null && node.right != null){

                    // siblings check
                    if(node.left.val == x && node.right.val == y ||
                    node.right.val == x && node.left.val == y){
                        return false;
                    }
                }

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }

            }

            if(foundX && foundY){
                return true;
            }
        }

        return false;
    }
}