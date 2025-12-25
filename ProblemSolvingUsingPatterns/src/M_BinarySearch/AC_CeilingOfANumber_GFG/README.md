# Ceiling in a Sorted Array

## Problem Statement

Given a **sorted array** and a value **`x`**, find the **index of the ceiling of `x`**.

The **ceiling of `x`** is the **smallest element in the array that is greater than or equal to `x`**.

### Note
- If there are **multiple occurrences** of the ceiling value, return the **index of the first occurrence**.
- If **no ceiling exists**, return **`-1`**.

---

## 🔗 Problem Link

- GeeksforGeeks:  
  https://www.geeksforgeeks.org/dsa/ceiling-in-a-sorted-array/

---

## Examples

### Example 1
**Input:**
arr = [1, 2, 8, 10, 10, 12, 19]
x = 5

**Output:**
2

**Explanation:**  
The smallest number greater than or equal to `5` is `8`, which is present at index `2`.

---

### Example 2
**Input:**
arr = [1, 2, 8, 10, 10, 12, 19]
x = 20

**Output:**
-1

**Explanation:**  
No element greater than or equal to `20` exists in the array.

---

### Example 3
**Input:**
arr = [1, 1, 2, 8, 10, 10, 12, 19]
x = 0

**Output:**
0

**Explanation:**  
The smallest number greater than or equal to `0` is `1`.  
Since `1` occurs at indices `0` and `1`, the **first occurrence (index 0)** is returned.

---