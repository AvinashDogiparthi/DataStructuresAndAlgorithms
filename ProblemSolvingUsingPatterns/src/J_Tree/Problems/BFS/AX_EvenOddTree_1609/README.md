# 1609. Even Odd Tree

🔗 Problem Link: [LeetCode - Even Odd Tree](https://leetcode.com/problems/even-odd-tree/)

---

## Problem Statement

A binary tree is called an **Even-Odd Tree** if it satisfies the following conditions:

- The root of the binary tree is at **level `0`**.
- The children of the root are at **level `1`**, their children are at **level `2`**, and so on.
- For every **even-indexed level**:
    - All node values must be **odd**.
    - Values must be in **strictly increasing order** from left to right.
- For every **odd-indexed level**:
    - All node values must be **even**.
    - Values must be in **strictly decreasing order** from left to right.

Given the `root` of a binary tree, return `true` if the tree is an **Even-Odd Tree**, otherwise return `false`.

---