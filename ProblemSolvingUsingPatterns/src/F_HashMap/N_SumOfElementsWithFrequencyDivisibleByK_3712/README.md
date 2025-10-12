# [3712. Sum of Elements With Frequency Divisible by K](https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/)

## Problem Description

You are given an integer array `nums` and an integer `k`.

Return an integer denoting the **sum of all elements** in `nums` whose **frequency is divisible by `k`**, or `0` if there are no such elements.

> Note:  
> An element is included in the sum exactly as many times as it appears in the array if its total frequency is divisible by `k`.

---

### Example 1:
**Input:**
nums = [1,2,2,3,3,3,3,4], k = 2

**Output:**
16

**Explanation:**
- 1 appears once → not divisible by 2
- 2 appears twice → divisible by 2
- 3 appears four times → divisible by 2
- 4 appears once → not divisible by 2

Hence, total sum = 2 + 2 + 3 + 3 + 3 + 3 = **16**

---

### Example 2:
**Input:**
nums = [1,2,3,4,5], k = 2

**Output:**
0

**Explanation:**  
No element appears an even number of times.

---

### Example 3:
**Input:**
nums = [4,4,4,1,2,3], k = 3

**Output:**
12


**Explanation:**
- 4 appears 3 times → divisible by 3
- 1, 2, 3 each appear once → not divisible by 3  
  Total sum = 4 + 4 + 4 = **12**

---

## 🔒 Constraints
- `1 <= nums.length <= 100`
- `1 <= nums[i] <= 100`
- `1 <= k <= 100`

---