package J_Tree.Problems.DFS.AN_MinimumDepthOfBinaryTree_111;

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
    public int minDepth(TreeNode root) {
        return getMinDepth(root);
    }

    private int getMinDepth(TreeNode node) {
        if (node == null) return 0;

        if (node.left == null) return getMinDepth(node.right) + 1;
        if (node.right == null) return getMinDepth(node.left) + 1;

        int left = getMinDepth(node.left);
        int right = getMinDepth(node.right);

        return Math.min(left, right) + 1;
    }
}