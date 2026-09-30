package J_Tree.Problems.DFS.AAC_BinaryTreePostOrderTraversal_145;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
import java.util.List;

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

    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        postOrder(root);
        return result;
    }

    public void postOrder(TreeNode node){

        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        result.add(node.val);
    }
}