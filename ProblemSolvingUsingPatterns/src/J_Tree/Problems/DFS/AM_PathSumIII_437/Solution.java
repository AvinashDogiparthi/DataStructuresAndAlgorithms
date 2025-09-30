package J_Tree.Problems.DFS.AM_PathSumIII_437;

import J_Tree.Problems.TreeNode;

import java.util.HashMap;
import java.util.Map;

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
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0L, 1); // base case: sum 0 occurs once
        return dfs(root, 0, targetSum, prefixSumCount);
    }

    private int dfs(TreeNode node, long currentSum, int targetSum, Map<Long, Integer> prefixSumCount) {
        if (node == null) return 0;

        currentSum += node.val;
        int count = prefixSumCount.getOrDefault(currentSum - targetSum, 0);

        prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);

        count += dfs(node.left, currentSum, targetSum, prefixSumCount);
        count += dfs(node.right, currentSum, targetSum, prefixSumCount);

        prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1);

        return count;
    }
}
