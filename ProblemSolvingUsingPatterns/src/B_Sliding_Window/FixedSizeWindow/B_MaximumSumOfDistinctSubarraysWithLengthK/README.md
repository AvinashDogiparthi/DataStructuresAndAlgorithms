# 📘 2461. Maximum Sum of Distinct Subarrays With Length K

🔗 [LeetCode Problem Link](https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/)

---

## 📖 Problem Statement

You are given an integer array `nums` and an integer `k`.  
Find the **maximum subarray sum** of all the subarrays of `nums` that meet the following conditions:

1. The length of the subarray is `k`, and
2. All the elements of the subarray are **distinct**.

Return the maximum subarray sum of all such subarrays.  
If no subarray meets the conditions, return `0`.

A subarray is a **contiguous non-empty sequence** of elements within an array.

---

## ✨ Examples

#### Example 1:

**Input:**
nums = [1,5,4,2,9,9,9], k = 3

**Output:**
15

**Explanation:**
The subarrays of length 3 are:

[1,5,4] → distinct → sum = 10

[5,4,2] → distinct → sum = 11

[4,2,9] → distinct → sum = 15 ✅

[2,9,9] → not distinct

[9,9,9] → not distinct
Maximum = 15



### Example 2 :

**Input:**
nums = [4,4,4], k = 3

**Output:**
0

**Explanation:**
The only subarray [4,4,4] has duplicates.
So, result = 0.
