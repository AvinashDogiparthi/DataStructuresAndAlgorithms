package J_Tree.Problems.DFS.AAQ_SumOfRootToLeafBinaryNumbers_1022;

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

    List<String> listOfValues = new ArrayList<>();
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        traverseAndCheck(root,"");
        return sum;
    }

    public void traverseAndCheck(TreeNode node, String temp){

        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            temp = temp + Integer.toString(node.val);
            sum = sum + Integer.parseInt(temp,2);
        } else {
            temp = temp + Integer.toString(node.val);
        }

        traverseAndCheck(node.left,temp);
        traverseAndCheck(node.right,temp);
    }
}