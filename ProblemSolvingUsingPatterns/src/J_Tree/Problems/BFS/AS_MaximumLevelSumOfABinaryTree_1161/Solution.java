package J_Tree.Problems.BFS.AS_MaximumLevelSumOfABinaryTree_1161;

import J_Tree.Problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

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
    public int maxLevelSum(TreeNode root) {
        return bfsTraversal(root);
    }
    
    public int bfsTraversal(TreeNode root){

        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int maxSum = Integer.MIN_VALUE;
        int maxsumLevel = 0;
        int level = 0;

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            level++;
            int levelSum = 0;

            for(int i = 0;i<levelSize;i++){

                TreeNode currentNode = queue.poll();
                levelSum = levelSum + currentNode.val;

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }

            if(levelSum > maxSum){
                maxSum = levelSum;
                maxsumLevel = level;
            }
        }

        return maxsumLevel;
    }
}