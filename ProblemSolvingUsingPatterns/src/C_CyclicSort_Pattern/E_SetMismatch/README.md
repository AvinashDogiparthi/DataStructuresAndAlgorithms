# 645. Set Mismatch

[LeetCode - Set Mismatch](https://leetcode.com/problems/set-mismatch/)

---

## Problem Description
You have a set of integers `s`, which originally contains all the numbers from `1` to `n`.  
Unfortunately, due to some error, one of the numbers in `s` got duplicated, which results in:
- **One number appearing twice**
- **Another number being missing**

You are given an integer array `nums` representing the data status of this set after the error.  
Your task is to find:
1. The number that occurs **twice**
2. The number that is **missing**

Return them as an array:  
[ duplicate_number, missing_number ]


---

## Examples

### Example 1:
**Input:**
nums = [1,2,2,4]
**Output:**
[2,3]


### Example 2:
**Input:**
nums = [1,1]
**Output:**
[1,2]

---

## Constraints
- `2 <= nums.length <= 10^4`
- `1 <= nums[i] <= 10^4`

---
