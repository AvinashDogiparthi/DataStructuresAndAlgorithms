# Top View of Binary Tree

### Problem Link
🔗 [GeeksforGeeks — Top View of Binary Tree](https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1)

---

## Problem Description

You are given the **root** of a binary tree, and your task is to return its **top view**.

The **top view** of a binary tree is the set of nodes visible when the tree is viewed from the **top**.

---

### Notes

- Return the nodes from **leftmost** to **rightmost**.
- If multiple nodes overlap at the same horizontal position, include **only the topmost (closest to the root)** node in the view.

---

## Examples

### Example 1:
**Input:**
root = [1, 2, 3]

**Output:**
[2, 1, 3]

**Explanation:**  
The green-colored nodes represent the top view of the binary tree.

---

### Example 2:
**Input:**
root = [10, 20, 30, 40, 60, 90, 100]

**Output:**
[40, 20, 10, 30, 100]

**Explanation:**  
From the top view, only the nodes `40`, `20`, `10`, `30`, and `100` are visible.

---

## Constraints

- `1 ≤ number of nodes ≤ 10⁵`
- `1 ≤ node->data ≤ 10⁵`

---

## Expected Time & Space Complexity

| Operation | Complexity |
|------------|-------------|
| **Time Complexity** | `O(n)` |
| **Auxiliary Space** | `O(n)` |

---