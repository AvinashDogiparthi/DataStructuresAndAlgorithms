# [918 · 3Sum Smaller](https://www.lintcode.com/problem/3sum-smaller/description)

---

## 📝 Description

Given an array of `n` integers `nums` and an integer `target`, find the number of **index triplets** `(i, j, k)` such that:

0 <= i < j < k < n

and

nums[i] + nums[j] + nums[k] < target

---

## 🧾 Input

- `nums`: An array of integers of length `n`.
- `target`: An integer representing the upper bound for the triplet sum.

---

## 📤 Output

- Return an integer representing the **count of triplets** that satisfy the condition `nums[i] + nums[j] + nums[k] < target`.

---

## 📘 Examples
```text

Example 1
Input:
nums = [-2, 0, -1, 3]
target = 2

Output:
3

Explanation:
There are three triplets whose sum is less than 2:
[-2, 0, -1] → sum = -3
[-2, 0, 3] → sum = 1
[-2, -1, 3] → sum = 0


Example 2
Input:
nums = [-2, 0, 1, 3]
target = 2
Output:
2

Explanation:
There are two triplets whose sum is less than 2:
[-2, 0, 1] → sum = -1
[-2, 0, 3] → sum = 1