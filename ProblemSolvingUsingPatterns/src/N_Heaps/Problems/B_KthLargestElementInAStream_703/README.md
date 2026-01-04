# 703. Kth Largest Element in a Stream

🔗 **Problem Link**:  
https://leetcode.com/problems/kth-largest-element-in-a-stream/

---

## Problem Overview

You are part of a **university admissions office** and need to dynamically track the  
**kth highest test score** as new applicants submit their scores in real time.

Your task is to implement a class that:
- Maintains a stream of scores
- Efficiently returns the **kth largest score** after each new submission

---

## Problem Statement

Implement the `KthLargest` class:

- `KthLargest(int k, int[] nums)`  
  Initializes the object with integer `k` and the initial stream of test scores.

- `int add(int val)`  
  Adds a new test score `val` to the stream and returns the **kth largest score so far**.

> Note:
- It is the **kth largest element in sorted order**
- **Not** the kth distinct element

---

## Examples

### Example 1
Input:
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]

Output:
[null, 4, 5, 5, 8, 8]

### Example 2
Input:
["KthLargest", "add", "add", "add", "add"]
[[4, [7, 7, 7, 7, 8, 3]], [2], [10], [9], [9]]

Output:
[null, 7, 7, 7, 8]

---