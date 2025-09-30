package J_Tree.Problems.DFS.AL_PathSumII_113;

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        findPaths(root,targetSum,new ArrayList<>(),result);

        return result;
    }

    public void findPaths(TreeNode node, int targetSum, List<Integer> nodeValues, List<List<Integer>> result){

        if(node == null) return;

        targetSum = targetSum - node.val;
        nodeValues.add(node.val);
        if(node.left == null && node.right == null && targetSum == 0){
           result.add(new ArrayList<>(nodeValues));
        } else {
            if(node.left != null){
            findPaths(node.left,targetSum,nodeValues,result);
            }

            if(node.right != null){
            findPaths(node.right,targetSum,nodeValues,result);
            }
        }

        nodeValues.remove(nodeValues.size()-1);
    }
}