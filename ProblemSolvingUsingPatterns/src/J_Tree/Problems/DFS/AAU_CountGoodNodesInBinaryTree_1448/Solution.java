package J_Tree.Problems.DFS.AAU_CountGoodNodesInBinaryTree_1448;

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

    int count = 0;
    public int goodNodes(TreeNode root) {
        traverseAndCheck(root, root.val);
        return count;
    }

    public void traverseAndCheck(TreeNode node, int value){

        if(node == null){
            return;
        }

        if(node.val >= value){
            value = Math.max(value,node.val);
            count = count + 1;
        }

        traverseAndCheck(node.left, value);
        traverseAndCheck(node.right, value);
    }
}