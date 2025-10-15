# 200. Number of Islands

### Problem Link
[LeetCode - Number of Islands](https://leetcode.com/problems/number-of-islands/)

---

## Problem Description

You are given an **m x n** 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water).  
Your task is to **return the number of islands**.

An island is formed by connecting adjacent lands **horizontally or vertically**.  
You may assume **all four edges** of the grid are surrounded by water.

---

## Intuition

This is a **graph traversal problem**.

- Each cell of `'1'` (land) can be seen as a **node**.
- Two nodes are connected if they are **adjacent horizontally or vertically**.
- Each group of connected `'1'` cells forms an **island**.

We can count islands using **BFS** or **DFS** by visiting all connected land cells and marking them as visited.

---

## Examples

### Example 1

**Input:**
```text
grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
```

**Output:**
```text
1
```

**Explanation:**
```text
There is only one connected land mass, hence 1 island.
```

### Example 2

**Input:**
```text
grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
```
**Output:**
```text
3
```

