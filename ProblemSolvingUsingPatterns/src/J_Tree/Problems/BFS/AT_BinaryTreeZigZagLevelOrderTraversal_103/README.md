# 103. Binary Tree Zigzag Level Order Traversal

**Difficulty:** Medium  
**Topics:** Tree, Breadth-First Search (BFS), Binary Tree, Queue, Deque  
**Companies:** LeetCode

**Problem Link:** [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

---

## Problem Statement

Given the root of a binary tree, return the **zigzag level order traversal** of its nodes' values.

- That is, traverse the tree **level by level**.
- For **even-indexed levels** (0, 2, 4, ...), traverse **left to right**.
- For **odd-indexed levels** (1, 3, 5, ...), traverse **right to left**.

---

## Examples

**Example 1:**

**Input:**
root = [3,9,20,null,null,15,7]

**Output:**
[[3],[20,9],[15,7]]

**Explanation:**
- Level 0 → left to right → [3]
- Level 1 → right to left → [20,9]
- Level 2 → left to right → [15,7]

**Example 2:**

**Input:**
root = [1]

**Output:**
[[1]]

**Example 3:**

**Input:**
root = []

**Output:**
[]

---

