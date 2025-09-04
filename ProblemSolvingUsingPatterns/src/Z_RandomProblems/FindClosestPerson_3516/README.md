# 🧍 3516. Find Closest Person

[LeetCode Problem Link](https://leetcode.com/problems/find-closest-person/?envType=daily-question&envId=2025-09-04)

---

## 📘 Problem Statement

You are given three integers `x`, `y`, and `z`, representing the positions of three people on a number line:

- `x` → position of **Person 1**
- `y` → position of **Person 2**
- `z` → position of **Person 3**, who does not move

Both **Person 1** and **Person 2** move toward **Person 3** at the same speed.

Determine which person reaches Person 3 first:

- Return **1** if Person 1 arrives first.
- Return **2** if Person 2 arrives first.
- Return **0** if both arrive at the same time.

---

## ✅ Examples

### Example 1
**Input:**
```text
x = 2, y = 7, z = 4
```
**Output:**
```text
1
```
**Explanation:**
```text
Person 1 is at position 2 → distance = 2

Person 2 is at position 7 → distance = 3

Person 1 reaches first → return 1
```

### Example 2
**Input:**
```text
x = 2, y = 5, z = 6
```
**Output:**
```text
2
```
**Explanation:**
```text
Person 1 → distance = 4

Person 2 → distance = 1

Person 2 reaches first → return 2
```

### Example 3
**Input:**
```text
x = 1, y = 5, z = 3
```
**Output:**
```text
0
```
**Explanation:**
```text
Person 1 → distance = 2

Person 2 → distance = 2

Both reach at the same time → return 0
```