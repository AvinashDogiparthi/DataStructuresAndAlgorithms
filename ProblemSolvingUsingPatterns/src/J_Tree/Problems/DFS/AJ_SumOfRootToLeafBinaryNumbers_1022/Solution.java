package J_Tree.Problems.DFS.AJ_SumOfRootToLeafBinaryNumbers_1022;

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
    public int sumRootToLeaf(TreeNode root) {
        return getTotalSum(root, 0);
    }

    private int getTotalSum(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        current = (current << 1) | node.val;

        if (node.left == null && node.right == null) {
            return current;
        }

        int leftSum = getTotalSum(node.left, current);
        int rightSum = getTotalSum(node.right, current);

        return leftSum + rightSum;
    }
}