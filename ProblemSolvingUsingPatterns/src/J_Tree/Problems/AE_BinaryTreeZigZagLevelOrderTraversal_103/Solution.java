package J_Tree.Problems.AE_BinaryTreeZigZagLevelOrderTraversal_103;

import J_Tree.Problems.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return new ArrayList<>();
        }

        boolean leftToRight = true;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while(!deque.isEmpty()){

            int levelSize = deque.size();
            List<Integer> currentLevelvalues = new ArrayList<>();

            for(int i = 0;i<levelSize;i++){

                if(leftToRight){

                    TreeNode node = deque.pollLast();
                    currentLevelvalues.add(node.val);

                    if(node.left != null){
                        deque.addFirst(node.left);
                    }

                    if(node.right != null){
                        deque.addFirst(node.right);
                    }
                } else {

                    TreeNode node = deque.pollFirst();
                    currentLevelvalues.add(node.val);

                    if(node.right != null){
                        deque.addLast(node.right);
                    } 

                    if(node.left != null){
                        deque.addLast(node.left);
                    }
                }
            }

            result.add(currentLevelvalues);
            leftToRight = !leftToRight;
        }

        return result;
    }
}