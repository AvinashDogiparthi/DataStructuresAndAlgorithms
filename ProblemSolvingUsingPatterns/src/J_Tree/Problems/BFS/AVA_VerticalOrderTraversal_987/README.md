# 987. Vertical Order Traversal of a Binary Tree

🔗 Problem Link: [LeetCode - Vertical Order Traversal of a Binary Tree](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/)

---

## Problem Statement

You are given the `root` of a binary tree.

Each node is assigned a position `(row, col)`:

- The root is at position `(0, 0)`.
- The left child of a node at `(row, col)` is at `(row + 1, col - 1)`.
- The right child of a node at `(row, col)` is at `(row + 1, col + 1)`.

Your task is to calculate the **vertical order traversal** of the binary tree.

The traversal should:

1. Group nodes according to their **column index**.
2. Return columns from the **leftmost column to the rightmost column**.
3. Within each column, nodes should appear from **top to bottom**.
4. If multiple nodes have the **same row and same column**, sort them by their **values** in ascending order.

---

### Example 1

**Input:**
```text
root = [3,9,20,null,null,15,7]
```

**Output:**
```text
[[9],[3,15],[20],[7]]
```
**Explanation:**

```text
The tree can be represented using (row, column) positions:

Therefore:

Column -1: [9]
Column  0: [3,15]
Column  1: [20]
Column  2: [7]

So the vertical traversal is:

[[9],[3,15],[20],[7]]
```