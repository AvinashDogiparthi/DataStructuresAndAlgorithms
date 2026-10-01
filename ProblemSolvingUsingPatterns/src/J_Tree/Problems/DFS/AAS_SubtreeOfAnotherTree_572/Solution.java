package J_Tree.Problems.DFS.AAS_SubtreeOfAnotherTree_572;

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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return checkIfSubRootAvailable(root, subRoot);
    }

    public boolean checkIfSubRootAvailable(TreeNode node, TreeNode subRoot){
        if(node == null){
            return false;
        }

        if(isSameTree(node, subRoot)){
            return true;
        }

        return checkIfSubRootAvailable(node.left, subRoot) || checkIfSubRootAvailable(node.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null || p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}