package J_Tree.Problems.DFS.AR_PsuedoPalindromicPathsInBinaryTree_1457;

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
    public int pseudoPalindromicPaths (TreeNode root) {
        traverseAndCheck(root, 0);
        return count;
    }

    public void traverseAndCheck(TreeNode node, int path){
        if(node == null){
            return;
        }
        path ^= (1 << node.val);

        if(node.left == null && node.right == null){

            if((path & (path-1)) == 0){
                count = count + 1;
            }
        } else{
            traverseAndCheck(node.left, path);
            traverseAndCheck(node.right, path);
        }
    }
}