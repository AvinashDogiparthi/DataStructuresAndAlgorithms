# Bottom View of Binary Tree

### Problem Link
🔗 [GeeksforGeeks — Bottom View of Binary Tree](https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1)

---

## Problem Description

You are given the **root** of a binary tree.  
Your task is to return its **bottom view**.

The **bottom view** of a binary tree is the set of nodes visible when the tree is viewed from the **bottom**.

---

### Note
- If there are multiple bottom-most nodes for a given **horizontal distance (HD)** from the root,  
  the **latter one** in **level order traversal** (BFS order) is considered.
- The result should list nodes from **leftmost** to **rightmost**.

---

## Examples

### Example 1:
**Input:**
root = [1, 2, 3, 4, 5, N, 6]

**Output:**
[4, 2, 5, 3, 6]


**Explanation:**  
The green nodes represent the **bottom view** of the binary tree.

---

### Example 2:
**Input:**
root = [20, 8, 22, 5, 3, 4, 25, N, N, 10, 14, N, N, 28, N]


**Output:**
[5, 10, 4, 28, 25]


**Explanation:**  
The green nodes represent the **bottom view** of the binary tree.

---

## Constraints

- `1 ≤ number of nodes ≤ 10⁵`

---

## Expected Time & Space Complexity

| Operation | Complexity |
|------------|-------------|
| **Time Complexity** | `O(n)` |
| **Auxiliary Space** | `O(n)` |

---