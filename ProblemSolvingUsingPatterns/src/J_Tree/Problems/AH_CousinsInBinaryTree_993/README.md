# 993. Cousins in Binary Tree

## Problem Statement

Given the root of a binary tree with unique values and the values of two different nodes of the tree `x` and `y`,  
return **true** if the nodes corresponding to the values `x` and `y` in the tree are **cousins**, or **false** otherwise.

Two nodes of a binary tree are **cousins** if:
- They are at the **same depth**.
- They have **different parents**.

Note:
- The root node is at depth `0`.
- Children of each depth `k` node are at depth `k + 1`.

---

## Examples

**Example 1:**

**Input:**
root = [1,2,3,4], x = 4, y = 3

**Output:**
false


---

**Example 2:**

**Input:**
root = [1,2,3,null,4,null,5], x = 5, y = 4

**Output:**
true

---
