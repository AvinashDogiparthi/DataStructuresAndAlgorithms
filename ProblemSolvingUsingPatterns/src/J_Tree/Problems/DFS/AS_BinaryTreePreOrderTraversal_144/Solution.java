package J_Tree.Problems.DFS.AS_BinaryTreePreOrderTraversal_144;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> listOfValues = new ArrayList<>();

        if(root == null){
            return listOfValues;
        }

        preOrder(root,listOfValues);
        return listOfValues;
    }

    public void preOrder(TreeNode node, List<Integer> listOfValues){

        if(node == null){
            return;
        }

        listOfValues.add(node.val);
        preOrder(node.left,listOfValues);
        preOrder(node.right,listOfValues);
    }
}