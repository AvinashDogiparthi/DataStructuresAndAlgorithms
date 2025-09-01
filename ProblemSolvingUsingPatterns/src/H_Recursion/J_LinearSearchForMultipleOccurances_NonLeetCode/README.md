# 🔍 Linear Search for Multiple Occurrences (Recursion)

## 📌 Problem Statement
Given an array of integers and a target value, return a list of **all indices** where the target element occurs in the array using recursion.  
If the target element is not found, return an **empty list**.

---

## 📝 Examples

**Example 1:**
```text
Input: nums = [1, 1, 2, 4, 3, 6], target = 1
Output: [0, 1]
Explanation: Target 1 occurs at indices 0 and 1.
```

**Example 2:**
```text
Input: nums = [1, 2, 3, 5, 6, 7, 8, 8, 8, 5, 5, 5, 3, 3, 3, 3, 3], target = 8
Output: [6, 7, 8]
Explanation: Target 8 occurs at indices 6, 7, and 8.
```

**Example 3:**
```text
Input: nums = [1, 2, 3, 5, 6, 7, 8, 8, 8, 5, 5, 5, 3, 3, 3, 3, 3], target = 100
Output: []
Explanation: Target 100 does not exist in the array.
```

---

## ⚙️ Constraints
- Array length `>= 1`
- Elements can be positive, negative, or zero.
- Must be solved using **recursion** (no loops allowed).

---