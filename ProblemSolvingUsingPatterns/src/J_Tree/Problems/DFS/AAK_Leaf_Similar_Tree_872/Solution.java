package J_Tree.Problems.DFS.AAK_Leaf_Similar_Tree_872;

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
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        traversal(root1,list1);
        traversal(root2,list2);

        return list1.equals(list2);
    }

    public void traversal(TreeNode node, List<Integer> list){

        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            list.add(node.val);
        }

        traversal(node.left,list);
        traversal(node.right,list);
    }
}