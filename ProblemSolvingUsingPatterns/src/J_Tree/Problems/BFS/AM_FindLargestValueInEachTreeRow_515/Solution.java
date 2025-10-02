package J_Tree.Problems.BFS.AM_FindLargestValueInEachTreeRow_515;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int max = Integer.MIN_VALUE;
            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){

                TreeNode node = queue.poll();
                if(node.val > max){
                    max = node.val;
                }

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            result.add(max);
        }

        return result;
    }
}