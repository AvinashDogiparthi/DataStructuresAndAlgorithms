package J_Tree.Problems.DFS.AAQ_TwoSumIV_653;

import J_Tree.Problems.TreeNode;

import java.util.HashSet;
import java.util.Set;

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

    Set<Integer> setOfValues = new HashSet<>();
    boolean isSumAvailable = false;
    public boolean findTarget(TreeNode root, int k) {
        travrseAndCheck(root,k);
        return isSumAvailable;
    }

    public void travrseAndCheck(TreeNode node, int target){

        if(node == null || isSumAvailable){
            return;
        }

        if(setOfValues.contains(target - node.val)){
            isSumAvailable = true;
        }

        setOfValues.add(node.val);

        travrseAndCheck(node.left, target);
        travrseAndCheck(node.right, target);
    }
}