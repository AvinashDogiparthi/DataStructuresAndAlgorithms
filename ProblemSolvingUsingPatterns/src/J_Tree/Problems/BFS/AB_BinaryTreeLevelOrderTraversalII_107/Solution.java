package J_Tree.Problems.BFS.AB_BinaryTreeLevelOrderTraversalII_107;

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            List<Integer> currentLevelValues = new ArrayList<>();

            for(int i = 0;i<levelSize;i++){

                TreeNode node = queue.poll();
                currentLevelValues.add(node.val);

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }

            // Inserts at the given index, shifting the existing elements to the right.
            result.add(0,currentLevelValues);
        }

        return result;
    }
}