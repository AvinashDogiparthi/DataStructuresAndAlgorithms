package J_Tree.Problems.BST.AF_ConvertSortedArrayToBinarySearchTree_108;

import J_Tree.Problems.TreeNode;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return build(nums, 0, nums.length - 1, null);
    }

    private TreeNode build(int[] nums, int left, int right, TreeNode root) {
        if (left > right) return root;

        int mid = left + (right - left) / 2;

        root = insert(nums[mid], root);

        root = build(nums, left, mid - 1, root);
        root = build(nums, mid + 1, right, root);

        return root;
    }

    public TreeNode insert(int value, TreeNode node) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.val) {
            node.left = insert(value, node.left);
        } else if (value > node.val) {
            node.right = insert(value, node.right);
        }
        return node;
    }
}