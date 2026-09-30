# 104. Maximum Depth of Binary Tree

[**LeetCode Problem Link**](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

---

## Problem Statement
Given the root of a binary tree, return its **maximum depth**.

A binary tree's maximum depth is the number of nodes along the **longest path** from the root node down to the farthest leaf node.

---

## Examples

### Example 1:
**Input:**  
`root = [3,9,20,null,null,15,7]`

**Output:**  
`3`

---

### Example 2:
**Input:**  
`root = [1,null,2]`

**Output:**  
`2`

---

## Constraints
- The number of nodes in the tree is in the range **[0, 10⁴]**.
- `-100 <= Node.val <= 100`

---

## Approach
We can solve this using **DFS (Depth-First Search)** or **BFS (Breadth-First Search)**.

- **DFS (Recursive):**
    - Traverse down to the leaf nodes.
    - At each node, compute the maximum depth of its left and right subtree.
    - Depth of the current node = `1 + max(leftDepth, rightDepth)`.
    - **Time Complexity:** `O(N)` → Each node is visited once.
    - **Space Complexity:** `O(H)` → Recursive stack space (`H = height of tree`).
