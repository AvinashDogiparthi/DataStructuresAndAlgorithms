# 1541. Minimum Insertions to Balance a Parentheses String

🔗 [LeetCode Problem Link](https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/)

---

## Problem Statement

Given a parentheses string `s` containing only the characters `'('` and `')'`.

A parentheses string is **balanced** if:

1. Any left parenthesis `'('` must have a corresponding **two consecutive** right parentheses `"))"`.
2. A left parenthesis `'('` must appear **before** its corresponding two consecutive right parentheses `"))"`.

In other words, we treat `'('` as an opening parenthesis and `"))"` as its closing parenthesis.

You are allowed to insert `'('` or `')'` at any position of the string to balance it.

Return the **minimum number of insertions** needed to make `s` balanced.

---

## Examples

### Example 1:
**Input:**
s = "(()))"

**Output:**
1

**Explanation:**
The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.

### Example 2 :
**Input:**
s = "())"

**Output:**
0

**Explanation:**
The string is already balanced.

### Example 3:
**Input:**
s = "))())("

**Output:**
3

**Explanation:**
Add '(' to match the first '))', Add '))' to match the last '('.
