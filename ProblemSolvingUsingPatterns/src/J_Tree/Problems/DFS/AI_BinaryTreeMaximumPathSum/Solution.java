package J_Tree.Problems.DFS.AI_BinaryTreeMaximumPathSum;

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

    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getSumOfPaths(root);
        return max;
    }

    public int getSumOfPaths(TreeNode node){

        if(node == null){
            return 0;
        }

        int left = getSumOfPaths(node.left);
        int right = getSumOfPaths(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left + right + node.val;

        max = Math.max(pathSum,max);

        return Math.max(left,right)+node.val;
    }
}