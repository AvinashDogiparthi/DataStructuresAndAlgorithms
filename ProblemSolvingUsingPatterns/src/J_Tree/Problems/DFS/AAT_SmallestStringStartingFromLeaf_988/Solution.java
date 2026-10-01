package J_Tree.Problems.DFS.AAT_SmallestStringStartingFromLeaf_988;

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

    String smallest =  "";
    public String smallestFromLeaf(TreeNode root) {
        traverseAndCheck(root,"");
        return smallest;
    }

    public void traverseAndCheck(TreeNode node, String currentString){

        if(node == null){
            return;
        }

        currentString =  (char) ('a' + node.val) + currentString;

        if(node.left == null && node.right == null){
            if(smallest.isEmpty() || currentString.compareTo(smallest) < 0){
                smallest = currentString;
            }
        }

        traverseAndCheck(node.left, currentString);
        traverseAndCheck(node.right, currentString);
    }
}