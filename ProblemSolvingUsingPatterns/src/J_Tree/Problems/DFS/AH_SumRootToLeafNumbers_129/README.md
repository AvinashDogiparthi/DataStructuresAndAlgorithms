# 129. Sum Root to Leaf Numbers

**Level:** Medium  
**Topics:** Tree, Depth-First Search, Binary Tree

## Problem Link
[LeetCode - Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/)

---

## Problem Statement

You are given the root of a binary tree containing digits from `0` to `9` only.

Each **root-to-leaf path** in the tree represents a number.

For example, the root-to-leaf path `1 → 2 → 3` represents the number **123**.

Return the **total sum** of all root-to-leaf numbers.

Test cases are generated so that the answer fits in a **32-bit integer**.

🔹 A **leaf** node is a node with no children.

---

## Examples

### Example 1
**Input:**
root = [1,2,3]

**Output:**
25

**Explanation:**
- Path `1 → 2` → number `12`
- Path `1 → 3` → number `13`
- Sum = `12 + 13 = 25`

---

### Example 2
**Input:**
root = [4,9,0,5,1]

**Output:**
1026

**Explanation:**
- Path `4 → 9 → 5` → number `495`
- Path `4 → 9 → 1` → number `491`
- Path `4 → 0` → number `40`
- Sum = `495 + 491 + 40 = 1026`

---

## ⚖️ Constraints
- The number of nodes in the tree is in the range `[1, 1000]`.
- `0 <= Node.val <= 9`
- The depth of the tree will not exceed `10`.

---