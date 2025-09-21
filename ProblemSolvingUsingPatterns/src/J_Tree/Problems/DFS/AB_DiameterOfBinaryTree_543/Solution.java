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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);

        return diameter-1;
    }

    int height(TreeNode node){

        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int recursiveDiameter = leftHeight + rightHeight + 1;
        diameter = Math.max(recursiveDiameter, diameter);

        return Math.max(leftHeight,rightHeight)+1;
    }
}