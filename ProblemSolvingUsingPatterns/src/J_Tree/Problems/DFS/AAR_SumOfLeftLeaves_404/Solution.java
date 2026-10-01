package J_Tree.Problems.DFS.AAR_SumOfLeftLeaves_404;

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

    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        iterateAndCheck(root,false);

        return sum;
    }

    public void iterateAndCheck(TreeNode node, boolean isLeft){
        if(node == null){
            return;
        }

        if(isLeft && (node.left == null && node.right == null)){
            sum = sum + node.val;
        }

        iterateAndCheck(node.left,true);
        iterateAndCheck(node.right,false);
    }
}