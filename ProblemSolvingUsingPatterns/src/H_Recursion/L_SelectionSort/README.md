# Selection Sort (Recursive Implementation in Java)

## Overview
**Selection Sort** is a simple comparison-based sorting algorithm.  
It repeatedly finds the **maximum (or minimum) element** from the unsorted portion of the array and places it in its correct position.

In this implementation, we use **recursion** instead of loops to perform selection sort.

---

## How Selection Sort Works
1. Start with the full array.
2. Find the **maximum element** in the unsorted part.
3. Swap it with the last element of the unsorted part.
4. Reduce the problem size by 1 and repeat the process.
5. Continue until the array is completely sorted.

---

## Time Complexity
- **Best Case:** `O(n^2)`
- **Average Case:** `O(n^2)`
- **Worst Case:** `O(n^2)`

## Space Complexity
- `O(1)` → Sorting happens in-place.
- Extra space only comes from recursion stack calls.

---

## 🧮 Example Walkthrough
**Input Array:**
[4, 3, 2, 1]

**Steps:**
- Pass 1: Find max = 4 → swap with last → [1, 3, 2, 4]
- Pass 2: Find max = 3 → swap with second last → [1, 2, 3, 4]
- Pass 3: Find max = 2 → swap with position 1 → [1, 2, 3, 4]
- Sorted ✅  
