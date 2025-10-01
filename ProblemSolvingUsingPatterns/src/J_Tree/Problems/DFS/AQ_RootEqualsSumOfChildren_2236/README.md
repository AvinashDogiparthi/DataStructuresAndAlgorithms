# 2236. Root Equals Sum of Children

**Problem Link:** [LeetCode - Root equals sum of children](https://leetcode.com/problems/root-equals-sum-of-children/)

## Problem Description
You are given the root of a binary tree that consists of exactly **3 nodes**: the root, its left child, and its right child.

Return `true` if the value of the root is equal to the sum of the values of its two children, or `false` otherwise.

---

### Example 1:
**Input:**
root = [10,4,6]

**Output:**
true

**Explanation:**
The values of the root, its left child, and its right child are 10, 4, and 6, respectively.  
Since `10 == 4 + 6`, we return true.

---

### Example 2:
**Input:**
root = [5,3,1]

**Output:**
false

**Explanation:**
The values of the root, its left child, and its right child are 5, 3, and 1, respectively.  
Since `5 != 3 + 1`, we return false.

---

## Constraints
- The tree consists only of the root, its left child, and its right child.
- `-100 <= Node.val <= 100`

---