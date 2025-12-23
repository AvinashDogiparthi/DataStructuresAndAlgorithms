package J_Tree.Problems.DFS.AV_FindBottomLeftTreeValue_513;

import J_Tree.Problems.TreeNode;

class Solution {
    private int maxDepth = -1;
    private int leftmostValue = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return leftmostValue;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        if (depth > maxDepth) {
            maxDepth = depth;
            leftmostValue = node.val;
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
