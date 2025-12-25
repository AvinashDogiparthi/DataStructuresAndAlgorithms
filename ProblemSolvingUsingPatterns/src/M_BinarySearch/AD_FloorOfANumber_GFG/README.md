# Floor in a Sorted Array

## Problem Statement

Given a **sorted array `arr[]`** and an integer **`x`**, find the **index (0-based)** of the **largest element in the array that is less than or equal to `x`**.

This element is called the **floor of `x`**.

### Note
- If there are **multiple occurrences** of the floor value, return the **index of the last occurrence**.
- If **no such element exists**, return **`-1`**.

---

## Problem Link

- GeeksforGeeks:  
  https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

---

## Examples

### Example 1
**Input:**
arr = [1, 2, 8, 10, 10, 12, 19]
x = 5

**Output:**
1

**Explanation:**  
The largest number less than or equal to `5` is `2`, which is present at index `1`.

---

### Example 2
**Input:**
arr = [1, 2, 8, 10, 10, 12, 19]
x = 11

**Output:**
4

**Explanation:**  
The largest number less than or equal to `11` is `10`.  
It occurs at indices `3` and `4`, so the **last occurrence (index 4)** is returned.

---

### Example 3
**Input:**
arr = [1, 2, 8, 10, 10, 12, 19]
x = 0

**Output:**
-1

**Explanation:**  
No element less than or equal to `0` exists in the array.

---