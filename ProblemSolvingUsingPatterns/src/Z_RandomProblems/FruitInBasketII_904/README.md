# 🍎 3477. Fruits Into Baskets II

[LeetCode Problem Link](https://leetcode.com/problems/fruits-into-baskets-ii/)

---

## 📘 Problem Statement

You are given two arrays of integers, `fruits` and `baskets`, each of length `n`, where:

- `fruits[i]` → the quantity of the *i-th* type of fruit.
- `baskets[j]` → the capacity of the *j-th* basket.

You need to place fruits **from left to right** following these rules:

1. Each fruit type must be placed in the **leftmost available basket** with a capacity **greater than or equal** to the quantity of that fruit type.
2. Each basket can hold **only one type** of fruit.
3. If a fruit type cannot be placed in any basket, it **remains unplaced**.

🔹 Return the number of fruit types that **remain unplaced** after all possible allocations are made.

---

## ✅ Example

### Example 1:
```text
Input: 
fruits = [2, 3, 5]
baskets = [3, 4, 5]

Output: 0

Explanation:
- Fruit type 1 (2) goes into basket 1 (3).
- Fruit type 2 (3) goes into basket 2 (4).
- Fruit type 3 (5) goes into basket 3 (5).
All fruits are placed, so answer = 0.
```

### Example 2 : 
Input:
fruits = [4, 2, 7]
baskets = [3, 4, 5]

Output: 1

Explanation:
- Fruit type 1 (4) goes into basket 2 (4).
- Fruit type 2 (2) goes into basket 1 (3).
- Fruit type 3 (7) cannot fit into any basket.
  So answer = 1.
