package J_Tree.Problems.DFS.AD_FlattenBinaryTreeToLinkedList_114;

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
class SolutionUsingQueueAndPreOrder {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        preOrder(root,queue);

        TreeNode current = queue.poll();
        while(!queue.isEmpty()){

            TreeNode next = queue.poll();
            current.left = null;
            current.right = next;
            current = next;
        }

    }

    public void preOrder(TreeNode node, Queue<TreeNode> queue){

        if(node == null){
            return;
        }

        queue.offer(node);
        preOrder(node.left,queue);
        preOrder(node.right,queue);
    }
}