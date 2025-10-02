package J_Tree.Problems.BST.AG_InOrderSuccessorInBST_285_LeetCodePremium;

import J_Tree.Problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null){
            return root;
        }

        Queue<TreeNode> listOfValues = new LinkedList<>();
        inOrderTraversal(root,listOfValues);

        while(!listOfValues.isEmpty()){

            TreeNode node = listOfValues.poll();

            if(node == p){
                return listOfValues.poll();
            }
        }

        return null;
    }

    private void inOrderTraversal(TreeNode node, Queue<TreeNode> listOfValues){

        if(node == null){
            return;
        }

        inOrderTraversal(node.left,listOfValues);
        listOfValues.offer(node);
        inOrderTraversal(node.right,listOfValues);
    }
}