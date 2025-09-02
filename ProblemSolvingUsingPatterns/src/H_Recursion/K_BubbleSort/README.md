# Bubble Sort (Recursive Implementation in Java)

## 📌 Overview
Bubble Sort is one of the simplest sorting algorithms.  
It works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order.  
This process continues until the array is completely sorted.

In this project, we implement **Bubble Sort using recursion** instead of the usual iterative approach.

---

## How Bubble Sort Works
1. Compare each pair of adjacent elements.
2. If the left element is greater than the right one → swap them.
3. After each full pass, the largest element "bubbles up" to the end of the array.
4. Repeat the process for the remaining unsorted part of the array.

---

## Time Complexity
- **Best Case (Already Sorted):** `O(n)`
- **Average Case:** `O(n^2)`
- **Worst Case (Reversed Array):** `O(n^2)`

## Space Complexity
- `O(1)` → Sorting happens in-place.
- Extra space only comes from recursion stack calls.

---

## Example Walkthrough
**Input Array:**
[4, 3, 2, 1]

**Steps:**
- Pass 1: [3, 2, 1, 4]
- Pass 2: [2, 1, 3, 4]
- Pass 3: [1, 2, 3, 4] ✅ Sorted