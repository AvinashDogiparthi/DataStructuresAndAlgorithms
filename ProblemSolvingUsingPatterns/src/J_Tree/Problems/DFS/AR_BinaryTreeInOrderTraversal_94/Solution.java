package J_Tree.Problems.DFS.AR_BinaryTreeInOrderTraversal_94;

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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> listOfvalues = new ArrayList<>();

        if(root == null){
            return listOfvalues;
        }

        performInOrderTraversal(root,listOfvalues);
        return listOfvalues;
    }

    public void performInOrderTraversal(TreeNode node, List<Integer> listOfValues){

        if(node == null){
            return;
        }

        performInOrderTraversal(node.left,listOfValues);
        listOfValues.add(node.val);
        performInOrderTraversal(node.right,listOfValues);
    }
}