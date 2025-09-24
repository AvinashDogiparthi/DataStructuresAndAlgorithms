package J_Tree.Problems.DFS.AG_PathSum_112;

import J_Tree.Problems.TreeNode;

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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return isPathExist(root,targetSum);
    }

    public boolean isPathExist(TreeNode node, int remaining){

        if(node == null){
            return false;
        }

        remaining = remaining - node.val;

        if(node.left == null && node.right == null){
            return remaining == 0;
        }


        boolean left = isPathExist(node.left, remaining);
        boolean right = isPathExist(node.right,remaining);

        return left || right;

        
    }
}