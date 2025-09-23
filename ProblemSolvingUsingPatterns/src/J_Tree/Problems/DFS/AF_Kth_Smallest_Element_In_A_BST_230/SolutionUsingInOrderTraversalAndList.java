package J_Tree.Problems.DFS.AF_Kth_Smallest_Element_In_A_BST_230;

import J_Tree.Problems.TreeNode;

import java.util.ArrayList;
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
class SolutionUsingInOrderTraversalAndList {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }

        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root,list);

        return list.get(k-1);
    }

    public void inOrderTraversal(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        inOrderTraversal(root.left,list);
        list.add(root.val);
        inOrderTraversal(root.right,list);
    }
}