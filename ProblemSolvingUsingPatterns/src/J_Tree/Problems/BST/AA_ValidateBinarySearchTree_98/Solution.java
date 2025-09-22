package J_Tree.Problems.BST.AA_ValidateBinarySearchTree_98;

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
    public boolean isValidBST(TreeNode root) {

        return isValidHelper(root, null, null);
    }

    public boolean isValidHelper(TreeNode node, Integer low, Integer high){

        if(node == null){
            return true;
        }

        if(low != null && node.val <= low){
            return false;
        }

        if(high != null && node.val >= high){
            return false;
        }

        boolean leftTree = isValidHelper(node.left,low,node.val);
        boolean rightTree = isValidHelper(node.right,node.val,high);

        return leftTree && rightTree;
    }
}