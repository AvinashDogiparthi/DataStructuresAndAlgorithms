# Concatenation of Array
🔗 **Problem Link:** https://leetcode.com/problems/concatenation-of-array/

---

## Problem Description

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` where:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`  
  for `0 <= i < n`

In simple terms, **`ans` is formed by concatenating `nums` with itself**.

Return the array `ans`.

---

## Example 1

**Input:**  
`nums = [1, 2, 1]`

**Output:**  
`[1, 2, 1, 1, 2, 1]`

**Explanation:**  
ans = [nums[0], nums[1], nums[2], nums[0], nums[1], nums[2]]
ans = [1, 2, 1, 1, 2, 1]


---

## Example 2

**Input:**  
`nums = [1, 3, 2, 1]`

**Output:**  
`[1, 3, 2, 1, 1, 3, 2, 1]`

**Explanation:**  
ans = [nums[0], nums[1], nums[2], nums[3], nums[0], nums[1], nums[2], nums[3]]
ans = [1, 3, 2, 1, 1, 3, 2, 1]

---

## Constraints

- `n == nums.length`
- `1 <= n <= 1000`
- `1 <= nums[i] <= 1000`

---