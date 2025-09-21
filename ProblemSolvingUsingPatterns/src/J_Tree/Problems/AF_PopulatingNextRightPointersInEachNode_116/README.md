# 116. Populating Next Right Pointers in Each Node

🔗 Problem Link: [LeetCode - Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)

---

## Problem Statement

You are given a **perfect binary tree** where:

- All leaves are on the same level.
- Every parent has two children.

Your task is to **populate each `next` pointer** to point to its **next right node**.  
If there is no next right node, the `next` pointer should be set to `NULL`.

Initially, all `next` pointers are set to `NULL`.

---

### Example 1

**Input:**
root = [1,2,3,4,5,6,7]

**Output:**
[1,#,2,3,#,4,5,6,7,#]


**Explanation:**
- Level 0: 1 → NULL
- Level 1: 2 → 3 → NULL
- Level 2: 4 → 5 → 6 → 7 → NULL

---

### Example 2

**Input:**
root = []

**Output:**
[]

---

## Constraints

- Number of nodes: `0 <= n <= 2^12 - 1`
- `-1000 <= Node.val <= 1000`

---