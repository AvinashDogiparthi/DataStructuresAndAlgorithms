# 513. Find Bottom Left Tree Value

### Problem Link
🔗 [LeetCode — Find Bottom Left Tree Value](https://leetcode.com/problems/find-bottom-left-tree-value/)

---

## Problem Description

Given the root of a binary tree, return the **leftmost value in the last row** of the tree.

The **last row** refers to the deepest level of the binary tree, and the **leftmost value** is the first node encountered from the left at that depth.

---

## Examples

### Example 1
**Input:**
root = [2, 1, 3]

**Output:**
1

**Explanation:**
```text
    2
   / \
  1   3
```

The last row is `[1, 3]` → leftmost = `1`.

---

### Example 2
**Input:**
root = [1, 2, 3, 4, null, 5, 6, null, null, 7]

**Output:**
7

**Explanation:**


```
        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7
```

The last row is `[7]` → leftmost = `7`.

---

## Constraints

- `1 ≤ number of nodes ≤ 10⁴`
- `-2³¹ ≤ Node.val ≤ 2³¹ - 1`

---