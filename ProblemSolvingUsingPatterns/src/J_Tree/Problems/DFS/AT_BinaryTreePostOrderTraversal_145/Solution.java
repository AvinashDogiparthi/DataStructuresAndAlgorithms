package J_Tree.Problems.DFS.AT_BinaryTreePostOrderTraversal_145;

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> listOfValues = new ArrayList<>();

        if(root == null){
            return listOfValues;
        }

        postOrder(root,listOfValues);
        return listOfValues;
    }

    public void postOrder(TreeNode node,List<Integer> listOfValues){

        if(node == null){
            return;
        }


        postOrder(node.left,listOfValues);
        postOrder(node.right,listOfValues);
        listOfValues.add(node.val);
    }
}