# 117. Populating Next Right Pointers in Each Node II

🔗 Problem Link: [LeetCode - Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)

---

## Problem Statement

You are given a binary tree where each node contains an additional `next` pointer.

```text
struct Node {
    int val;
    Node *left;
    Node *right;
    Node *next;
}

Your task is to populate each next pointer so that it points to the next right node at the same level.

If there is no next right node at that level, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Unlike Problem 116, this tree is not necessarily a perfect binary tree. Nodes may have only a left child, only a right child, or no children.

```

```text
Example 1

Input:

root = [1,2,3,4,5,null,7]

Output:

[1,#,2,3,#,4,5,7,#]

Explanation:

The tree is:

          1
        /   \
       2     3
      / \     \
     4   5     7

After populating the next pointers:

Level 0: 1 → NULL
Level 1: 2 → 3 → NULL
Level 2: 4 → 5 → 7 → NULL

Therefore, the serialized output is:

[1,#,2,3,#,4,5,7,#]

Here, # represents the end of each level.
```