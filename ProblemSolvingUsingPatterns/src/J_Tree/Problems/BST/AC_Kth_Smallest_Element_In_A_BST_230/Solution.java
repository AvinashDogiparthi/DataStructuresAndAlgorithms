package J_Tree.Problems.BST.AC_Kth_Smallest_Element_In_A_BST_230;

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

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }

    public TreeNode helper(TreeNode root, int k){
        if(root == null){
            return root;
        }

        TreeNode left = helper(root.left,k);

        if(left != null){
            return left;
        }

        count++;

        if(count == k){
            return root;
        }

        return helper(root.right,k);
    }
}