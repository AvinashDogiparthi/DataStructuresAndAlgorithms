# 1971. Find if Path Exists in Graph

**Link:** [LeetCode Problem - Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/)

---

## Problem Description

There is a **bi-directional graph** with `n` vertices, where each vertex is labeled from `0` to `n - 1` (inclusive).  
The edges in the graph are represented as a 2D integer array `edges`, where each `edges[i] = [ui, vi]` denotes a bi-directional edge between vertex `ui` and vertex `vi`.

You need to determine if there exists a **valid path** between `source` and `destination`.

Return **true** if a valid path exists from `source` to `destination`, otherwise return **false**.

---

## Example

### Example 1:
```text
Input:
n = 3
edges = [[0,1],[1,2],[2,0]]
source = 0
destination = 2

Output:
true

Explanation:
There are two paths from vertex 0 to vertex 2:
- 0 → 1 → 2
- 0 → 2

```

### Example 2:
```text
Input:
n = 6
edges = [[0,1],[0,2],[3,5],[5,4],[4,3]]
source = 0
destination = 5

Output:
false

Explanation:
There is no path from vertex 0 to vertex 5.
```

---
### Constraints
```text
1 <= n <= 2 * 10^5
0 <= edges.length <= 2 * 10^5
edges[i].length == 2
0 <= ui, vi <= n - 1
ui != vi
0 <= source, destination <= n - 1
No duplicate or self edges
```