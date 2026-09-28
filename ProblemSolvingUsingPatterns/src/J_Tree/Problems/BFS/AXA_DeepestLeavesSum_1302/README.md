# 1302. Deepest Leaves Sum

🔗 Problem Link: [LeetCode - Deepest Leaves Sum](https://leetcode.com/problems/deepest-leaves-sum/)

---

## Problem Statement

You are given the `root` of a binary tree.

Your task is to return the **sum of the values of all the deepest leaves** in the binary tree.

A **leaf node** is a node that has no left or right child.

The **deepest leaves** are the leaf nodes located at the maximum depth of the tree.

---

### Example 1

**Input:**

```text
root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
```

**Output:**
```text
15
```

**Explanation:**

```text
The binary tree is:

              1
            /   \
           2     3
          / \     \
         4   5     6
        /           \
       7             8

The deepest leaves are:

7 and 8

Their sum is:

7 + 8 = 15

Therefore:

Output = 15
```