# Order-Agnostic Binary Search

## Problem Statement

You are given a **sorted array of integers** and a **target element**.  
The array may be sorted in **ascending order** or **descending order**.

Your task is to **determine the sorting order** and then perform **Binary Search** to find the target element.

- If the target exists, return its **index**
- If the target does not exist, return **-1**

The solution must run in **O(log n)** time complexity.

---

## Example 1 (Ascending Order)

**Input:**
```text
nums = [2, 4, 6, 8, 10, 12]
target = 8
```

**Output:**
3

**Explanation:**
The array is sorted in ascending order. Binary search finds 8 at index 3.


## Example 2 (Descending Order)

**Input:**
```text
nums = [20, 17, 15, 13, 10, 8, 5]
target = 10
```

**Output:**
4

**Explanation:**
The array is sorted in descending order. Binary search finds 10 at index 4.