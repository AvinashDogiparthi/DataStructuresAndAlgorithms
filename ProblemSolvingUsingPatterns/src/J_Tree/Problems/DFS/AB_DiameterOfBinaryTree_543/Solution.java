package J_Tree.Problems.DFS.AB_DiameterOfBinaryTree_543;

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

    public int diameter = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {

        height(root);

        return diameter;
    }

    public int height(TreeNode node){

        if(node == null){
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        int recursiveDiameter = left + right;
        diameter = Math.max(recursiveDiameter,diameter);

        return Math.max(left,right) + 1;
    }
}