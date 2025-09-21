package J_Tree.Problems.BFS.AG_BinaryTreeRightSideView_199;

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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> rightSideValues = new ArrayList<>();

        if(root == null){
            return new ArrayList<>();
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

            rightSideValues.add(currentLevelValues.get(currentLevelValues.size()-1));
        }

        return rightSideValues;
    }
}