# 1080. Insufficient Nodes in Root to Leaf Paths

🔗 Problem Link: [LeetCode - Insufficient Nodes in Root to Leaf Paths](https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/)

---

## Problem Statement

Given the `root` of a binary tree and an integer `limit`, delete all **insufficient nodes** in the tree simultaneously, and return the root of the resulting binary tree.

A node is **insufficient** if every root-to-leaf path passing through that node has a sum strictly less than `limit`.

A **leaf** is a node with no children.

---

## Example 1

**Input:**

```text
root = [1,2,3,4,-99,-99,7,8,-99,-99,-99,-99,9]
limit = 1
```

**Output:**

```text
[1,2,3,4,null,null,7,8,null,null,9]
```

**Explanation:**

We evaluate every root-to-leaf path.

Any node that does not belong to a root-to-leaf path whose sum is at least `limit` is removed.

The remaining nodes form the resulting tree.

---

## Example 2

**Input:**

```text
root = [5,4,8,11,null,17,4,7,1,null,null,5,3]
limit = 22
```

**Output:**

```text
[5,4,8,11,null,17,4,7,null,5,3]
```

**Explanation:**

Only nodes that belong to at least one root-to-leaf path with sum greater than or equal to `22` remain in the tree.

---

## Approach

We can solve this problem using **DFS + Bottom-Up Pruning**.

The important observation is:

> We cannot decide whether a node is insufficient until we know whether its child subtrees contain a valid root-to-leaf path.

So we process the tree from the **bottom up**.

For every node:

1. Subtract the current node's value from `limit`.
2. Recursively process the left subtree.
3. Recursively process the right subtree.
4. If the node is a leaf:

    * Keep it if its remaining required sum is `<= 0`.
    * Otherwise, delete it.
5. If the node is not a leaf:

    * If both children were deleted, delete the current node.
    * Otherwise, keep it.

---

## Key Idea

Instead of calculating the complete sum for every root-to-leaf path, we carry the remaining required sum.

Suppose:

```text
limit = 22
```

and the path is:

```text
5 → 4 → 11
```

We can update the remaining limit:

```text
22 - 5 = 17
17 - 4 = 13
13 - 11 = 2
```

Since the path has not reached `22`, the leaf is insufficient.

This can be represented as:

```text
dfs(node, limit - node.val)
```

---

## DFS Logic

For every node:

```text
limit -= node.val
```

Then process both children:

```text
node.left = dfs(node.left, limit)
node.right = dfs(node.right, limit)
```

After processing the children, we decide whether the current node should remain.

---

## Leaf Node Condition

A leaf is a node where:

```text
node.left == null
&&
node.right == null
```

For a leaf, check:

```text
remainingLimit > 0
```

If this is true:

```text
leaf is insufficient
```

So return:

```text
null
```

Otherwise:

```text
leaf is sufficient
```

and keep the node.

---

## Non-Leaf Node Condition

After recursively processing both children:

```text
node.left = dfs(node.left, remainingLimit)
node.right = dfs(node.right, remainingLimit)
```

If both children are now `null`:

```text
node.left == null
&&
node.right == null
```

then there is no valid root-to-leaf path passing through this node.

Therefore, the current node must also be removed.

```text
return null
```

Otherwise:

```text
return node
```

---

## Why Do We Process Bottom-Up?

Consider:

```text
        1
       /
      2
     /
    3
```

Suppose the path:

```text
1 → 2 → 3
```

does not satisfy the required limit.

We first discover that `3` is insufficient.

After removing `3`, node `2` becomes a leaf.

Now we need to check whether `2` itself has a valid path.

If it does not, `2` must also be removed.

Then `1` may also become insufficient.

Therefore, the deletion can propagate upward.

This is why **postorder DFS** is the natural approach.

---

## Postorder DFS Pattern

The traversal order is:

```text
Left
Right
Node
```

For this problem:

```text
DFS(left)
DFS(right)
Process current node
```

This is important because we need to know what happened to the children before deciding whether the current node should be deleted.

---

## Example

Consider:

```text
        1
       / \
      2   3
     /   / \
    4   5   6
```

Suppose:

```text
limit = 10
```

Consider the paths:

```text
1 → 2 → 4 = 7
1 → 3 → 5 = 9
1 → 3 → 6 = 10
```

Only:

```text
1 → 3 → 6
```

reaches the required limit.

Therefore:

* Node `4` is removed.
* Node `5` is removed.
* Node `2` becomes a leaf with no valid path → removed.
* Node `6` remains.
* Node `3` remains because it has a valid path through `6`.
* Node `1` remains because it has a valid path through `3 → 6`.

Result:

```text
        1
         \
          3
           \
            6
```

---

## Important Observation

A node is **not** removed simply because one path through it has a small sum.

The node should remain if **at least one** root-to-leaf path passing through it has a sum greater than or equal to `limit`.

For example:

```text
        5
       / \
      2   10
```

If the path through `2` is insufficient but the path through `10` is sufficient, node `5` must remain.

So the condition is:

```text
At least one valid root-to-leaf path
```

---

## Why Do We Modify the Tree During DFS?

Instead of separately collecting all insufficient nodes, we can directly prune them.

For example:

```text
node.left = dfs(node.left, remainingLimit)
node.right = dfs(node.right, remainingLimit)
```

If the child subtree is insufficient:

```text
dfs(...)
```

returns:

```text
null
```

and the parent automatically loses that child.

This makes the solution clean and efficient.

---

## Important Difference from Normal Path Sum

This problem is slightly different from simply finding whether a root-to-leaf path reaches a target sum.

We need to **modify the tree**.

Therefore, the DFS should return:

```text
TreeNode
```

rather than:

```text
boolean
```

The returned value represents:

```text
The root of the valid/pruned subtree.
```

---

## Recursive DFS Structure

The recursive logic can be represented as:

```text
dfs(node, limit):

    if node == null:
        return null

    limit = limit - node.val

    node.left = dfs(node.left, limit)
    node.right = dfs(node.right, limit)

    if node.left == null
       AND node.right == null
       AND remaining limit > 0:

        return null

    return node
```

The important part is that the children are processed **before** deciding whether the current node should be removed.

---

## Complexity

Let `N` be the number of nodes in the binary tree.

### Time Complexity

```text
O(N)
```

Every node is visited once.

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
DFS + Postorder + Tree Pruning
```

The general pattern is:

```text
Process children
      ↓
Decide whether current node should remain
      ↓
Return modified subtree
```

This pattern is useful for tree problems where the validity of a node depends on information from its descendants.

---

## Important Rules

Remember these points:

1. Use **DFS**.
2. Use **postorder traversal**.
3. Carry the remaining `limit` down the tree.
4. Subtract `node.val` from `limit`.
5. Process both children first.
6. A leaf is removed if its remaining required sum is greater than `0`.
7. A non-leaf is removed if both of its children become `null`.
8. A node stays if **at least one valid root-to-leaf path** passes through it.
9. Return the modified subtree root from DFS.

---

## Summary

The main idea is:

```text
DFS from root to leaf.

Carry the remaining required sum.

Process left and right subtrees first.

If a leaf cannot satisfy the limit:
    delete it.

After processing children:
    If both children are gone,
    delete the current node.

Otherwise:
    keep the node.
```

### Pattern to Remember

```text
Postorder DFS
      +
Path Sum
      +
Bottom-Up Tree Pruning
```

The most important interview insight is:

> **A node should remain if and only if at least one root-to-leaf path through that node can satisfy the required limit.**

---
