package J_Tree.Problems.DFS.AAL_Univalued_Binary_Tree_965;

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
    public boolean isUnivalTree(TreeNode root) {
        int initialValue = root.val;
        return isUni(root, initialValue);
    }

    public boolean isUni(TreeNode node, int value){

        if(node == null){
            return true;
        }

        if(node.val != value){
            return false;
        }

        boolean left = isUni(node.left,value);
        boolean right = isUni(node.right,value);
        
        return left && right;
    }
}