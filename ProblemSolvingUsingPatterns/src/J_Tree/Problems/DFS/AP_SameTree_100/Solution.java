package J_Tree.Problems.DFS.AP_SameTree_100;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }
        
        if(p.val != q.val){
            return false;
        }

        boolean leftComparision = isSameTree(p.left,q.left);
        boolean rightComparision = isSameTree(p.right,q.right);

        return leftComparision && rightComparision;
    }
}