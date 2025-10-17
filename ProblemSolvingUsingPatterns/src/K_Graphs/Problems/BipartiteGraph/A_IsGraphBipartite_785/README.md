# [785. Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/)

## Problem Description
There is an **undirected graph** with `n` nodes, numbered from `0` to `n - 1`.

You are given a **2D array** `graph`, where `graph[u]` is a list of nodes adjacent to node `u`.  
Formally, for each `v` in `graph[u]`, there is an undirected edge between `u` and `v`.

### Graph Properties
- No self-edges (`graph[u]` does not contain `u`)
- No duplicate edges
- If `v` is in `graph[u]`, then `u` is in `graph[v]`
- The graph may be **disconnected**

A graph is **bipartite** if the nodes can be partitioned into two sets `A` and `B` such that every edge connects a node in `A` to a node in `B`.

Return `true` if and only if the graph is bipartite.

---

### Example 1
**Input:**
```text
graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
```

**Output:**
```text
false
```

**Explanation:**
```text
No valid bipartition exists.
```

### Example 2
**Input:**
```text
graph = [[1,3],[0,2],[1,3],[0,2]]
```

**Output:**
```text
true
```

**Explanation:** 
```text
Partition possible as {0,2} and {1,3}.
```


---

### Constraints
```text
graph.length == n
1 <= n <= 100
0 <= graph[u].length < n
0 <= graph[u][i] <= n - 1
graph[u] does not contain u
All values in graph[u] are unique
If graph[u] contains v, then graph[v] contains u
```