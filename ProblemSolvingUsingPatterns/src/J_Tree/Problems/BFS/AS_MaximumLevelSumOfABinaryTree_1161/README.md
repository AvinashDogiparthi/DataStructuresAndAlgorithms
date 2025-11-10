# 1161. Maximum Level Sum of a Binary Tree

### Problem Link
🔗 [LeetCode — Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/)

---

## Problem Description

Given the root of a binary tree, where:

- The **root** is at level `1`
- Its **children** are at level `2`
- And so on...

Return the **smallest level number `x`** such that the **sum of all node values** at level `x` is **maximal**.

---

## Examples

### Example 1
**Input:**
root = [1, 7, 0, 7, -8, null, null]

**Output:**
2

**Explanation:**

| Level | Nodes     | Sum |
|:------|:-----------|:----|
| 1 | [1] | 1 |
| 2 | [7, 0] | 7 |
| 3 | [7, -8] | -1 |

The level with the maximum sum = **level 2**.

---

### Example 2
**Input:**
root = [989, null, 10250, 98693, -89388, null, null, null, -32127]

**Output:**
2

**Explanation:**
- Level 1 sum = 989
- Level 2 sum = 10250
- Level 3 sum = 98693 + (-89388) = 9305
- Level 4 sum = -32127  
  ✅ Maximum sum occurs at **level 2**.

---

## Constraints

- `1 ≤ number of nodes ≤ 10⁴`
- `-10⁵ ≤ Node.val ≤ 10⁵`

---