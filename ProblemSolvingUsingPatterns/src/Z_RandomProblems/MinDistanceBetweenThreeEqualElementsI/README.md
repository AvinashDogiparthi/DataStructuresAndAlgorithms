# Minimum Distance Between Three Equal Elements I

🔗 **Problem Link:** [LeetCode #100301 — Minimum Distance Between Three Equal Elements I](https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/)

---

## Problem Statement

You are given an integer array `nums`.

A tuple `(i, j, k)` of **three distinct indices** is called **good** if:

nums[i] == nums[j] == nums[k]

The **distance** of a good tuple is defined as:

abs(i - j) + abs(j - k) + abs(k - i)

Return the **minimum possible distance** among all good tuples.  
If no such tuples exist, return `-1`.

---

## Examples

### Example 1:
**Input:**
nums = [1,2,1,1,3]

**Output:**
6

**Explanation:**
The good tuple is `(0, 2, 3)` because all are equal to `1`.  
Distance = |0 - 2| + |2 - 3| + |3 - 0| = 2 + 1 + 3 = **6** ✅

---

### Example 2:
**Input:**
nums = [1,1,2,3,2,1,2]

**Output:**
8

**Explanation:**
The good tuple is `(2, 4, 6)` because all are equal to `2`.  
Distance = |2 - 4| + |4 - 6| + |6 - 2| = 2 + 2 + 4 = **8** 

---

### Example 3:
**Input:**
nums = [1]

**Output:**
-1

**Explanation:**
There are no three equal elements, hence no valid tuple.

---

## Constraints
- `1 <= n == nums.length <= 100`
- `1 <= nums[i] <= n`

---