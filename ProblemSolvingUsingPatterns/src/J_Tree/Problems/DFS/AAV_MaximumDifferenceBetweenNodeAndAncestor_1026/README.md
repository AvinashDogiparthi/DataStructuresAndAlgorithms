# 1026. Maximum Difference Between Node and Ancestor

🔗 Problem Link: [LeetCode - Maximum Difference Between Node and Ancestor](https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/)

---

## Problem Statement

Given the `root` of a binary tree, find the maximum value `v` for which there exist **different** nodes `a` and `b` where:

```text
v = |a.val - b.val|
```

and `a` is an **ancestor** of `b`.

A node `a` is an ancestor of `b` if:

* `a` is the parent of `b`, or
* `a` is an ancestor of the parent of `b`.

In other words, `a` must appear somewhere on the path from the root to `b`.

---

## Example 1

**Input:**

```text
root = [8,3,10,1,6,null,14,null,null,4,7,13]
```

**Output:**

```text
7
```

**Explanation:**

One maximum difference is:

```text
|8 - 1| = 7
```

where `8` is an ancestor of `1`.

Another valid pair is:

```text
|14 - 7| = 7
```

Therefore, the maximum difference is:

```text
7
```

---

## Example 2

**Input:**

```text
root = [1,null,2,null,0,3]
```

**Output:**

```text
3
```

**Explanation:**

The path is:

```text
1 → 2 → 0 → 3
```

The maximum difference between an ancestor and descendant is:

```text
|0 - 3| = 3
```

---

## Approach

We can solve this problem using **DFS + Path Minimum/Maximum**.

The important observation is:

> For the current node, we only need to know the minimum and maximum values that appeared on the path from the root to this node.

Suppose the current node has value:

```text
current.val = 10
```

and the path from the root contains:

```text
3, 7, 5, 10
```

Then:

```text
minimum = 3
maximum = 10
```

The largest possible difference involving the current node is:

```text
max(|10 - 3|, |10 - 10|)
= 7
```

Instead of comparing the current node with every ancestor, we only need the **minimum and maximum ancestor values**.

---

## Key Idea

For every node, maintain:

```text
minValue = minimum value seen on the path
maxValue = maximum value seen on the path
```

For the current node:

```text
difference1 = |current.val - minValue|
difference2 = |current.val - maxValue|
```

The maximum difference can be updated using:

```text
maxDifference = max(
    maxDifference,
    current.val - minValue,
    maxValue - current.val
)
```

Then update the path information:

```text
minValue = min(minValue, current.val)
maxValue = max(maxValue, current.val)
```

and continue DFS.

---

## DFS Logic

Suppose the tree is:

```text
        8
       / \
      3   10
     / \
    1   6
```

Start at the root:

```text
current = 8
min = 8
max = 8
```

Move to node `3`:

```text
current = 3
min = 8
max = 8
```

Difference:

```text
|3 - 8| = 5
```

Update:

```text
min = 3
max = 8
```

Move to node `1`:

```text
current = 1
min = 3
max = 8
```

Differences:

```text
|1 - 3| = 2
|1 - 8| = 7
```

Maximum:

```text
7
```

Therefore, we don't need to explicitly store the entire path.

---

## Why Do We Only Need Minimum and Maximum?

Suppose the ancestors of the current node are:

```text
2, 5, 8, 10
```

and the current node is:

```text
6
```

We could calculate:

```text
|6 - 2| = 4
|6 - 5| = 1
|6 - 8| = 2
|6 - 10| = 4
```

The maximum difference is obtained using either:

```text
minimum ancestor
```

or:

```text
maximum ancestor
```

So we only need:

```text
minValue = 2
maxValue = 10
```

This reduces unnecessary comparisons.

---

## Important Observation

The problem specifically says that `a` must be an **ancestor** of `b`.

Therefore, we cannot compare arbitrary nodes in the tree.

For example:

```text
        8
       / \
      3   10
```

Nodes `3` and `10` are not ancestors of each other.

Therefore:

```text
|3 - 10| = 7
```

cannot be considered.

Our DFS naturally avoids this problem because `minValue` and `maxValue` contain values only from the **current root-to-node path**.

---

## Root-to-Node Path

At every point during DFS, we maintain information about:

```text
root → current node
```

For example:

```text
        8
       /
      3
     /
    1
   /
  4
```

When processing `4`, the path is:

```text
8 → 3 → 1 → 4
```

So:

```text
minValue = 1
maxValue = 8
```

The current node `4` can only be compared with:

```text
8, 3, 1
```

which are exactly its ancestors.

---

## Updating Min and Max

For the current node:

```text
current.val
```

calculate the difference first:

```text
current.val - minValue
maxValue - current.val
```

Then update:

```text
minValue = Math.min(minValue, current.val)
maxValue = Math.max(maxValue, current.val)
```

This is important because the current node becomes an ancestor for all of its descendants.

---

## Example

Consider:

```text
        8
       / \
      3   10
     / \    \
    1   6    14
```

For the path:

```text
8 → 3 → 1
```

we have:

```text
min = 1
max = 8
```

Difference:

```text
8 - 1 = 7
```

For the path:

```text
8 → 10 → 14
```

we have:

```text
min = 8
max = 14
```

Difference:

```text
14 - 8 = 6
```

The maximum overall difference is:

```text
7
```

---

## Recursive DFS Structure

The recursive function can be thought of as:

```text
dfs(node, minValue, maxValue)
```

where:

* `node` → current node
* `minValue` → minimum value from root to current node
* `maxValue` → maximum value from root to current node

At every node:

```text
difference = max(
    node.val - minValue,
    maxValue - node.val
)
```

Then:

```text
newMin = min(minValue, node.val)
newMax = max(maxValue, node.val)
```

Finally:

```text
dfs(node.left, newMin, newMax)
dfs(node.right, newMin, newMax)
```

---

## Alternative: Track the Answer During DFS

We can maintain a global answer:

```text
maxDifference
```

At every node:

```text
maxDifference = max(
    maxDifference,
    node.val - minValue,
    maxValue - node.val
)
```

Then continue traversing the tree.

This makes the DFS very simple.

---

## Why Is This a DFS Problem?

The condition depends on the **ancestor path**.

DFS naturally follows one root-to-leaf path:

```text
Root
 ↓
Child
 ↓
Child
 ↓
Current Node
```

Therefore, information about ancestors can easily be passed down as parameters.

This is a common pattern for tree problems involving:

* Ancestors
* Root-to-leaf paths
* Path sums
* Minimum/maximum path values
* Path constraints

---

## Complexity

Let `N` be the number of nodes in the binary tree.

### Time Complexity

```text
O(N)
```

Every node is visited exactly once.

At each node, we perform only constant-time operations.

### Space Complexity

```text
O(H)
```

where `H` is the height of the tree.

The space is used by the recursive DFS call stack.

* Balanced tree → `O(log N)`
* Skewed tree → `O(N)`

No additional data structure proportional to `N` is required.

---

## DFS Pattern

This problem follows the pattern:

```text
DFS + Path Information
```

More specifically:

```text
DFS
 +
Track Minimum and Maximum Along Path
```

General structure:

```text
dfs(node, minValue, maxValue)

    Calculate answer using current node

    Update minValue
    Update maxValue

    dfs(left)
    dfs(right)
```

---

## Important Rules

Remember these points:

1. Only compare a node with its **ancestors**.
2. Do not compare arbitrary nodes in the tree.
3. Maintain the minimum value on the current root-to-node path.
4. Maintain the maximum value on the current root-to-node path.
5. For the current node, compare it with both:

    * `minValue`
    * `maxValue`
6. Update the path information before visiting children.
7. DFS naturally maintains the ancestor relationship.

---

## Summary

The main idea is:

```text
DFS from the root.

For every node:

    Keep:
        minimum value seen on the path
        maximum value seen on the path

    Calculate:
        node.val - minimum
        maximum - node.val

    Update the answer.

    Update minimum and maximum.

    Continue DFS.
```

We don't need to store the entire path or compare the current node with every ancestor.

### Pattern to Remember

```text
DFS
 +
Ancestor Information
 +
Path Minimum / Maximum
```

This is a very useful binary-tree pattern whenever a problem asks you to compare a node with one of its **ancestors or values along the root-to-node path**.

---
