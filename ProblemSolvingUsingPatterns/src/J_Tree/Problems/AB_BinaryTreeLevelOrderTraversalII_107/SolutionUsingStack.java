package J_Tree.Problems.AB_BinaryTreeLevelOrderTraversalII_107;

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
class SolutionUsingStack {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> stack = new Stack<>();

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

            stack.push(currentLevelValues);
        }

        List<List<Integer>> finalResult = new ArrayList<>();

        while(!stack.isEmpty()){
            finalResult.add(stack.pop());
        }

        return finalResult;
    }
}