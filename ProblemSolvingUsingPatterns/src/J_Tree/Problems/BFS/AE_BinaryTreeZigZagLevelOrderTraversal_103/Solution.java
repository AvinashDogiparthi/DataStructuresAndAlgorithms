package J_Tree.Problems.BFS.AE_BinaryTreeZigZagLevelOrderTraversal_103;

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
            return result;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        boolean leftToRight = true;

        while(!deque.isEmpty()){

            int levelSize = deque.size();
            List<Integer> currentLevelValues = new ArrayList<>();

            for(int i = 0;i<levelSize;i++){

                if(leftToRight){

                    TreeNode node = deque.pollFirst();
                    currentLevelValues.add(node.val);

                    if(node.left != null){
                        deque.addLast(node.left);
                    }

                    if(node.right != null){
                        deque.addLast(node.right);
                    }
                } else {

                    TreeNode node = deque.pollLast();
                    currentLevelValues.add(node.val);

                    if(node.right != null){
                        deque.addFirst(node.right);
                    }

                    if(node.left != null){
                        deque.addFirst(node.left);
                    }
                }
            }

            result.add(currentLevelValues);
            leftToRight = !leftToRight;
        }

        return result;
    }
}