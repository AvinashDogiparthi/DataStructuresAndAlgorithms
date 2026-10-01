package J_Tree.Problems.DFS.AB_MergeTwoBinaryTrees_617;

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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return traverseAndCheck(root1, root2);
    }

    public TreeNode traverseAndCheck(TreeNode node1, TreeNode node2){

        if(node1 == null){
            return node2;
        }

        if(node2 == null){
            return node1;
        }

        node1.val = node1.val + node2.val;

        node1.left = traverseAndCheck(node1.left, node2.left);
        node1.right = traverseAndCheck(node1.right, node2.right);

        return node1;
    }
}