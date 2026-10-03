package J_Tree.Problems.DFS.AAV_MaximumDifferenceBetweenNodeAndAncestor_1026;

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

    int maxDiff = Integer.MIN_VALUE;

    public int maxAncestorDiff(TreeNode root) {
        traverseAndCheck(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
        return maxDiff;
    }

    public void traverseAndCheck(TreeNode node, int minValue, int maxValue){
        if(node == null){
            maxDiff = Math.max(maxDiff, (maxValue - minValue));
            return;
        }

        minValue = Math.min(minValue,node.val);
        maxValue = Math.max(maxValue, node.val);

        traverseAndCheck(node.left, minValue, maxValue);
        traverseAndCheck(node.right, minValue, maxValue);
    }
}