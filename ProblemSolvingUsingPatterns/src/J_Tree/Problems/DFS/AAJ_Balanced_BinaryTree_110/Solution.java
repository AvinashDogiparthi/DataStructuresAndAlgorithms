package J_Tree.Problems.DFS.AAJ_Balanced_BinaryTree_110;

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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        return traverseAndCheck(root);
    }

    public boolean traverseAndCheck(TreeNode node){
        if(node == null){
            return true;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        if(Math.abs(leftHeight - rightHeight ) > 1 ){
            return false;
        }

        return traverseAndCheck(node.left) && traverseAndCheck(node.right);
    }
    
    public int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight , rightHeight) + 1;
    }
}