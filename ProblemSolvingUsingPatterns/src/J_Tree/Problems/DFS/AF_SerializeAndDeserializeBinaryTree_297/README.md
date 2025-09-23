# 297. Serialize and Deserialize Binary Tree

**Level:** Hard  
**Topics:** Tree, Design, Depth-First Search, Breadth-First Search

---

## Problem Link
[LeetCode - Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)

## Problem Statement

Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to **serialize** and **deserialize** a binary tree.

There is **no restriction** on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string, and this string can be deserialized back to the original tree structure.

🔹 The input/output format is the same as how **LeetCode** serializes a binary tree.  
🔹 You do not necessarily need to follow this format, so you can be creative and use different approaches.

---

## Examples

### Example 1
Input: root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]

shell
Copy code

### Example 2
Input: root = []
Output: []

pgsql
Copy code

---

## Constraints
- The number of nodes in the tree is in the range **[0, 10⁴]**.
- `-1000 <= Node.val <= 1000`

---
