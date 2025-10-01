
package J_Tree.Problems.BST.AD_InsertNodeInBST_701;

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }

        return insert(root,val);
        
    }

    public TreeNode insert(TreeNode node, int val){

        if(node == null){
            TreeNode finalNode = new TreeNode(val);
            return finalNode;
        }

        if(val < node.val){
            node.left = insert(node.left,val);
        } else {
            node.right = insert(node.right,val);
        }

        return node;
    }
}