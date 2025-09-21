package J_Tree.Problems.AD_LevelOrderSuccessorOfANodeInBinaryTree;

import J_Tree.Concepts.D_Traversal.BinaryTree;
import J_Tree.Problems.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // Create root
        TreeNode root = new TreeNode(20, null, null);

        // Left subtree
        root.left = new TreeNode(10, null, null);
        root.left.left = new TreeNode(4, null, null);

        root.left.right = new TreeNode(18, null, null);
        root.left.right.left = new TreeNode(14, null, null);
        root.left.right.left.left = new TreeNode(13, null, null);
        root.left.right.left.right = new TreeNode(15, null, null);
        root.left.right.right = new TreeNode(19, null, null);

        // Right subtree
        root.right = new TreeNode(26, null, null);
        root.right.left = new TreeNode(24, null, null);
        root.right.right = new TreeNode(27, null, null);

        int levelOrderSuccessor = getLevelOrderSuccessorOfANodeInBinaryTree(24,root);
        System.out.println(levelOrderSuccessor);

        int levelOrderSuccessor2 = getLevelOrderSuccessorOfANodeInBinaryTree(4,root);
        System.out.println(levelOrderSuccessor2);
    }

    public static int getLevelOrderSuccessorOfANodeInBinaryTree(int value, TreeNode root){

        if(root == null){
            return -1;
        }

        if(root.val == value){

            if(root.left != null){
                return root.left.val;
            }

            if(root.right != null){
                return root.right.val;
            }

            // no child nodes
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){
                TreeNode node = queue.poll();

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }

                if(node.val == value){
                    return queue.peek().val;
                }
            }
        }

        return -1;
    }
}
