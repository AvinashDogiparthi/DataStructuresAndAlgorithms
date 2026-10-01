# 1448. Count Good Nodes in Binary Tree

🔗 Problem Link: [LeetCode - Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)

---

## Problem Statement

Given a binary tree `root`, a node **X** in the tree is called **good** if in the path from the root to `X`, there are no nodes with a value **greater than X**.

Return the number of **good nodes** in the binary tree.

### Example 1

**Input:**

```text
root = [3,1,4,3,null,1,5]
```

**Output:**

```text
4
```

**Explanation:**

The good nodes are:

* `3` → Root is always good.
* `4` → `4 >= 3`, so it is good.
* `3` → Path is `3 → 1 → 3`, and `3` is not smaller than any previous value.
* `5` → `5 >= 4`, so it is good.

Therefore, there are `4` good nodes.

---

### Example 2

**Input:**

```text
root = [3,3,null,4,2]
```

**Output:**

```text
3
```

**Explanation:**

The good nodes are:

* Root `3`
* Second `3`
* Node `4`

Node `2` is not good because there is a `3` before it in the path.

---

## Approach

We can solve this problem using **DFS (Depth First Search)**.

The important thing to remember is the **maximum value encountered from the root to the current node**.

For every node:

1. Compare the current node's value with the maximum value seen so far.
2. If `current.val >= maxValue`, the node is **good**.
3. Update `maxValue`.
4. Recursively visit the left and right children.
5. Add the number of good nodes from both subtrees.

---

## Key Idea

Instead of checking the complete path every time, maintain:

```text
maxValue = maximum value from root to current node
```

For the current node:

```text
if current.val >= maxValue
    current node is good
```

Then update:

```text
maxValue = max(maxValue, current.val)
```

This allows us to check whether a node is good in **O(1)** time.

---

## DFS Logic

Suppose we have:

```text
        3
       / \
      1   4
     /   / \
    3   1   5
```

Start at the root:

```text
Node = 3
maxValue = 3
```

`3 >= 3` → Good ✅

Go to the left:

```text
Node = 1
maxValue = 3
```

`1 < 3` → Not good ❌

Go to:

```text
Node = 3
maxValue = 3
```

`3 >= 3` → Good ✅

Now visit the right subtree:

```text
Node = 4
maxValue = 3
```

`4 >= 3` → Good ✅

Then:

```text
Node = 1
maxValue = 4
```

`1 < 4` → Not good ❌

And:

```text
Node = 5
maxValue = 4
```

`5 >= 4` → Goo
