package J_Tree.Problems.BST.AE_ConstructBinarySearchTreeFromPreOrderTraversal_1008;

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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = null;

        for(int n : preorder){
            root = insert(root,n);
        }

        return root;
    }

    public TreeNode insert(TreeNode node, int val){

        if(node == null){
            return new TreeNode(val);
        }

        if(node.val > val){
            node.left = insert(node.left,val);
        }

        if(node.val < val){
            node.right = insert(node.right,val);
        }

        return node;
    }
}