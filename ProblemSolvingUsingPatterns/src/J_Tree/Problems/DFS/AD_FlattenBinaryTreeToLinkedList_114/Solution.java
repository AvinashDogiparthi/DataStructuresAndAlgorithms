package J_Tree.Problems.DFS.AD_FlattenBinaryTreeToLinkedList_114;

import J_Tree.Problems.TreeNode;

/**
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
    public void flatten(TreeNode root) {
        
        if(root == null){
            return;
        }

        TreeNode current = root;
        
        while(current != null ){

            if(current.left != null){

                TreeNode temp = current.left;

                while(temp.right != null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;

            }

            current = current.right;

        }
    }
}
