# 402. Remove K Digits

🔗 **Problem Link:** [LeetCode - Remove K Digits](https://leetcode.com/problems/remove-k-digits/)

---

## 📌 Problem Statement
Given a string `num` representing a non-negative integer and an integer `k`, return the smallest possible integer after removing exactly `k` digits from `num`.

If the resulting number has leading zeroes, remove them. If the number becomes empty, return `"0"`.

---

## 💡 Examples

**Example 1:**
Input: num = "1432219", k = 3

Output: "1219"

Explanation: Remove digits '4', '3', and '2' → smallest number is "1219".



**Example 2:**
Input: num = "10200", k = 1

Output: "200"

Explanation: Remove '1' → "0200" → remove leading zeroes → "200".


**Example 3:**
Input: num = "10", k = 2

Output: "0"

Explanation: Removing all digits leaves nothing → return "0".