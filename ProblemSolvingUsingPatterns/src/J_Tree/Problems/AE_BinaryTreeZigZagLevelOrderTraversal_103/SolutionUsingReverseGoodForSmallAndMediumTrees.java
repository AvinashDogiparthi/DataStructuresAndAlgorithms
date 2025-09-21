package J_Tree.Problems.AE_BinaryTreeZigZagLevelOrderTraversal_103;

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
class SolutionUsingReverseGoodForSmallAndMediumTrees {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return new ArrayList<>();
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

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

            if (reverse) {
                Collections.reverse(currentLevelValues);
            }
            
            result.add(currentLevelValues);
            reverse = !reverse;
        }

        return result;
    }
}