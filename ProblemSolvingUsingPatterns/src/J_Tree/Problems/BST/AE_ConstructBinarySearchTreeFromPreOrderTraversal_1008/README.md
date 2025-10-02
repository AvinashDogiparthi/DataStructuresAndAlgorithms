# [1008. Construct Binary Search Tree from Preorder Traversal](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/)

## Problem Statement

Given an array of integers `preorder`, which represents the **preorder traversal of a BST** (binary search tree), construct the tree and return its root.

- It is guaranteed that a valid BST can always be constructed from the given `preorder` array.

### Binary Search Tree (BST) Property:
- For every node, all descendants in `Node.left` are **strictly less** than `Node.val`.
- All descendants in `Node.right` are **strictly greater** than `Node.val`.

### Preorder Traversal Definition:
- Visit the **root** node first.
- Traverse the **left subtree**.
- Traverse the **right subtree**.

---

## Examples

### Example 1:
**Input:**  
preorder = [8,5,1,7,10,12]

**Output:**  
[8,5,10,1,7,null,12]

---

### Example 2:
**Input:**  
preorder = [1,3]

**Output:**  
[1,null,3]

---

## Constraints
- `1 <= preorder.length <= 100`
- `1 <= preorder[i] <= 1000`
- All the values in `preorder` are **unique**.

---