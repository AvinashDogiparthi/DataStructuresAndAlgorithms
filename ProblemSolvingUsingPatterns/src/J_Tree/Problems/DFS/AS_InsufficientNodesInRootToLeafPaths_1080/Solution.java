package J_Tree.Problems.DFS.AS_InsufficientNodesInRootToLeafPaths_1080;

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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return traverseAndCheck(root,0,limit);
    }

    public TreeNode traverseAndCheck(TreeNode node,int sum, int limit){
        
        if(node == null){
            return null;
        }


        sum = sum + node.val;

        if(node.left == null && node.right == null){
            if(sum < limit){
                return null;
            } else {
                return node;
            }
        }

        node.left = traverseAndCheck(node.left,sum,limit);
        node.right = traverseAndCheck(node.right, sum, limit);

        if(node.left == null && node.right == null){
            return null;
        }

        return node;
    }
}