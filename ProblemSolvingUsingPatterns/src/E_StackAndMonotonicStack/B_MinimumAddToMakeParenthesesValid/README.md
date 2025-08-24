# 921. Minimum Add to Make Parentheses Valid

🔗 [LeetCode Problem Link](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/)

---

## Problem Statement

A **parentheses string** is valid if and only if:

1. It is the **empty string**,
2. It can be written as **AB** (A concatenated with B), where both A and B are valid strings, or
3. It can be written as **(A)**, where A is a valid string.

You are given a parentheses string `s`.  
In **one move**, you can insert a parenthesis at **any position** in the string.

Return the **minimum number of moves** required to make `s` valid.

---

## Examples

### Example 1:
**Input:**
s = "())"
**Output:**
1

### Example 2 :
**Input:**
s = "((("

**Output:**
3
