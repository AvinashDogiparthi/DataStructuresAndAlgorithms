package J_Tree.Problems.BFS.AN_KthLargestSumInABinaryTree_2583;

import J_Tree.Problems.TreeNode;

import java.util.*;

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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> result = new ArrayList<>();


        if(root == null){
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            long levelsum = 0;
            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                TreeNode node = queue.poll();
                levelsum = node.val + levelsum;


                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            result.add(levelsum);
        }

        Collections.sort(result);
        System.out.println(result);

        if(result.size()-k >= 0){
            return result.get(result.size()-k);
        } else {
            return -1;
        }
    }
}