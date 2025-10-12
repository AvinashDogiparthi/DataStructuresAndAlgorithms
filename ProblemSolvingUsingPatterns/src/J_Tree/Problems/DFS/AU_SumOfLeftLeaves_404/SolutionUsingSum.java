package J_Tree.Problems.DFS.AU_SumOfLeftLeaves_404;

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
class SolutionUsingSum {
    
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,false);
        return sum;
    }

    public void helper(TreeNode node, boolean isLeft){

        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            if(isLeft){
                sum = sum + node.val;
            }
            return;
        }

        helper(node.left,true);
        helper(node.right,false);
    }
}