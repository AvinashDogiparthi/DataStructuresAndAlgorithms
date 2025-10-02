# [285. Inorder Successor in BST](https://leetcode.com/problems/inorder-successor-in-bst/)

## Problem Statement

Given the root of a **Binary Search Tree (BST)** and a node `p` in it, return the **in-order successor** of that node in the BST.  
If the given node has no in-order successor in the tree, return `null`.

The **successor** of a node `p` is the node with the **smallest key greater than `p.val`**.

---

## Examples

### Example 1:
**Input:**  
root = [2,1,3], p = 1

**Output:**  
2

**Explanation:**  
The in-order traversal is `[1,2,3]`.  
The successor of node `1` is `2`.

---

### Example 2:
**Input:**  
root = [5,3,6,2,4,null,null,1], p = 6

**Output:**  
null

**Explanation:**  
The in-order traversal is `[1,2,3,4,5,6]`.  
Node `6` has no successor, so return `null`.

---

## Constraints
- The number of nodes in the tree is in the range `[1, 10^4]`.
- `-10^5 <= Node.val <= 10^5`
- All nodes have **unique values**.

---