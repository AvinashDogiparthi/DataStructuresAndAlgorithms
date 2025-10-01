# [108. Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

## Problem Statement

Given an integer array `nums` where the elements are sorted in ascending order, convert it to a **height-balanced binary search tree (BST)**.

A height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differs by more than one.

---

## Examples

### Example 1:
**Input:**  
nums = [-10,-3,0,5,9]

**Output:**  
[0,-3,9,-10,null,5]

**Explanation:**  
One possible answer is `[0,-10,5,null,-3,null,9]` which is also a height-balanced BST.

---

### Example 2:
**Input:**  
nums = [1,3]

**Output:**  
[3,1]

**Explanation:**  
Both `[1,null,3]` and `[3,1]` are valid height-balanced BSTs.

---

## Constraints
- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` is sorted in a **strictly increasing order**.

---