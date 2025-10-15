# 547. Number of Provinces

### Problem Link
[LeetCode - Number of Provinces](https://leetcode.com/problems/number-of-provinces/)

---

## Problem Description

There are **n** cities. Some of them are connected, while some are not.  
If city **A** is directly connected with city **B**, and city **B** is directly connected with city **C**,  
then **A** is also connected *indirectly* with **C**.

A **province** is a group of **directly or indirectly connected cities**, and no other cities outside of the group.

You are given an **n x n adjacency matrix** `isConnected`, where:

isConnected[i][j] = 1 → city i and city j are directly connected
isConnected[i][j] = 0 → city i and city j are not directly connected

yaml
Copy code

Return the **total number of provinces**.

---

## Intuition

This is a **graph connectivity problem**.

- Each city = a **node**.
- `isConnected[i][j] = 1` means there’s an **edge** between city *i* and *j*.
- The goal is to count the **number of connected components** in the graph.

We can use **BFS** or **DFS** to explore connected cities and mark them as visited.  
Each traversal that starts from an unvisited city represents one **province**.

---

## Example 1

**Input:**
```text
isConnected = [
  [1,1,0],
  [1,1,0],
  [0,0,1]
]
```

**Output:**

```text
2
```

**Explanation:**
```text
Province 1 → {0, 1}

Province 2 → {2}
```

### Example 2

**Input:**

```text
isConnected = [
  [1,0,0],
  [0,1,0],
  [0,0,1]
]
```
**Output:**

```text
3
```

**Explanation:**
```text
Each city is isolated → 3 separate provinces.
```
