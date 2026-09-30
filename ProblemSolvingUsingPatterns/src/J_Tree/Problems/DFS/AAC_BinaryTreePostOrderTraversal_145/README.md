# [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)

## Problem Statement

Given the root of a binary tree, return the **postorder traversal** of its nodes' values.

---

## Examples

### Example 1:
**Input:**  
`root = [1,null,2,3]`

**Output:**  
`[3,2,1]`

**Explanation:**
- Postorder traversal visits: left subtree → right subtree → root.

---

### Example 2:
**Input:**  
`root = [1,2,3,4,5,null,8,null,null,6,7,9]`

**Output:**  
`[4,6,7,5,2,9,8,3,1]`

**Explanation:**  
Postorder traversal:
- Traverse left subtree `[2,4,5,6,7]`
- Traverse right subtree `[3,8,9]`
- Visit root `1`

---

### Example 3:
**Input:**  
`root = []`

**Output:**  
`[]`

---

### Example 4:
**Input:**  
`root = [1]`

**Output:**  
`[1]`

---

## Constraints
- The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

---