# 589. N-ary Tree Preorder Traversal

🔗 Problem Link: [LeetCode - N-ary Tree Preorder Traversal](https://leetcode.com/problems/n-ary-tree-preorder-traversal/)

---

## Problem Statement

Given the `root` of an **N-ary tree**, return the **preorder traversal** of its nodes' values.

In an N-ary tree, each node can have **zero or more children**.

In **preorder traversal**, we visit:

1. The current node.
2. All of its children from **left to right**.

N-ary tree input serialization is represented in its level order traversal. Each group of children is separated by the `null` value.

---

## Preorder Traversal

The preorder traversal follows this pattern:

```text
Node → Child 1 → Child 2 → ... → Child N