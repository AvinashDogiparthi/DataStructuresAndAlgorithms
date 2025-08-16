# 1047. Remove All Adjacent Duplicates In String

[Problem Link](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)

---

## 📌 Problem Statement

You are given a string `s` consisting of lowercase English letters.  
A **duplicate removal** consists of choosing **two adjacent and equal letters** and removing them.

We repeatedly make duplicate removals on `s` until we can no longer do so.  
Return the final string after all such duplicate removals have been made.  
It can be proven that the answer is **unique**.

---

## 🔎 Examples

**Example 1:**
Input: s = "abbaca"

Output: "ca"

Explanation:
* In "abbaca", remove "bb" → "aaca"
* Then remove "aa" → "ca"


**Example 2:**
Input: s = "azxxzy"

Output: "ay"
Explanation:
* In "azxxzy", remove "xx" → "azzy"
* Then remove "zz" → "ay"

---

## ✅ Constraints
- `1 <= s.length <= 10^5`
- `s` consists of lowercase English letters.

---
