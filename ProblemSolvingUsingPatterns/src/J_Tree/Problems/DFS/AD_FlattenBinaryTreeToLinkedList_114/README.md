# 114. Flatten Binary Tree to Linked List

## Problem Statement
Given the root of a binary tree, **flatten the tree into a "linked list"**:

- The "linked list" should use the same `TreeNode` class where the **right child pointer** points to the next node in the list.
- The **left child pointer** is always `null`.
- The order of the linked list should follow the **pre-order traversal** of the binary tree.

🔗 Problem Link: [LeetCode - Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)

---

## Examples

### Example 1:
**Input**:  
root = [1,2,5,3,4,null,6]

**Output**:  
[1,null,2,null,3,null,4,null,5,null,6]

### Example 2:
**Input**:  
root = []

**Output**:  
[]

### Example 3:
**Input**:  
root = [0]

**Output**:  
[0]

---

## Constraints
- Number of nodes: `0 <= n <= 2000`
- Node values: `-100 <= Node.val <= 100`

---