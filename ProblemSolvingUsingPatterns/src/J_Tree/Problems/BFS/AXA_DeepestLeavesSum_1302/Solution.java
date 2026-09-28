package J_Tree.Problems.BFS.AXA_DeepestLeavesSum_1302;

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
    public int deepestLeavesSum(TreeNode root) {

        if(root == null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int lastLevelSum = 0;

        while(!queue.isEmpty()){

            lastLevelSum = 0;
            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                TreeNode node = queue.poll();
                lastLevelSum = node.val + lastLevelSum;

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }

        return lastLevelSum;
        
    }
}