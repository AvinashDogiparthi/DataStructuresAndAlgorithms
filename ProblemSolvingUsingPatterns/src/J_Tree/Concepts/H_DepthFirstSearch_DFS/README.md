# Depth-First Search (DFS) in Trees

## Introduction
Depth-First Search (DFS) is a tree/graph traversal technique where we explore as **deep as possible along one branch** before backtracking.

In trees, DFS explores nodes starting from the root and goes down to the leaf nodes before moving sideways to siblings.

DFS is commonly used in problems such as:
- Checking symmetry in trees
- Tree serialization/deserialization
- Path-related problems
- Deleting/freeing up nodes in a tree

---

## Types of DFS Traversals in Binary Trees
DFS can be implemented in three main ways (depending on the order of visiting root, left, and right):

1. **Pre-order (Root → Left → Right)**
    - Visit the root node first.
    - Then recursively traverse the left subtree.
    - Finally, traverse the right subtree.
    - Example order: `[1, 2, 4, 5, 3]`

2. **In-order (Left → Root → Right)**
    - Traverse the left subtree first.
    - Visit the root node.
    - Finally, traverse the right subtree.
    - Example order: `[4, 2, 5, 1, 3]`
    - Commonly used in **Binary Search Trees** because it visits nodes in **sorted order**.

3. **Post-order (Left → Right → Root)**
    - Traverse the left subtree.
    - Then the right subtree.
    - Finally, visit the root node.
    - Example order: `[4, 5, 2, 3, 1]`
    - Very useful in scenarios where **children must be processed before the parent**.

---

## Why DFS is Used for Deleting a Tree
When deleting a tree, **Post-order DFS** is preferred because:
- We first delete the left subtree.
- Then delete the right subtree.
- Finally, delete the root node.

This ensures that when we delete a node, its children have already been deleted, preventing **dangling references** or **memory leaks**.

For example:
```java
void deleteTree(TreeNode root) {
    if (root == null) return;
    deleteTree(root.left);   // Delete left subtree
    deleteTree(root.right);  // Delete right subtree
    root = null;             // Delete current node
}

```

# DFS vs BFS in Trees

## DFS (Depth-First Search)
- Goes **deep** before exploring siblings.
- **Space Complexity:** `O(H)` (where `H` = height of the tree).
- **Best suited for problems where full path exploration is required**, such as:
    - Path sum problems
    - Subtree problems
    - Deleting a tree

---

## BFS (Breadth-First Search)
- Explores the tree **level by level**.
- **Space Complexity:** `O(W)` (where `W` = maximum width of the tree).
- **Best suited for problems that require:**
    - Shortest path
    - Level-order traversal

---

## Complexity of DFS
- **Time Complexity:** `O(N)` → Each node is visited once.
- **Space Complexity:**
    - Recursive DFS → `O(H)` stack space (due to recursion).
    - Iterative DFS (using an explicit stack) → `O(H)` space as well.

---

## Summary
- **DFS** explores a tree deep first before backtracking.
- Comes in three traversal orders:
    - **Pre-order**
    - **In-order**
    - **Post-order**
- **Post-order DFS** is specifically used when deleting a tree because:
    - Children are deleted first
    - Parent nodes are deleted last, ensuring no dangling references.
