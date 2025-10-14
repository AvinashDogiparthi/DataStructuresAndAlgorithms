# Breadth-First Search (BFS)

## What is BFS?

**Breadth-First Search (BFS)** is a **graph traversal algorithm** that explores all the neighbors of a node before moving to the next level of nodes.  
It visits nodes in a **level-by-level** manner starting from a given **source vertex**.

BFS is commonly used to find the **shortest path** in an unweighted graph, detect **connected components**, or simply traverse all vertices.

---

## Key Idea

- BFS visits nodes **level by level**.
- It starts from a **source vertex**, explores all its **direct neighbors**,  
  then moves to the **neighbors’ neighbors**, and continues until all vertices are visited.
- It is typically implemented using a **Queue (FIFO)** data structure.

---

## Algorithm Steps

1. **Initialize** a queue and mark all vertices as unvisited.
2. **Enqueue** the starting vertex and mark it as visited.
3. While the queue is not empty:
    - **Dequeue** a vertex `v`.
    - For each **unvisited neighbor** of `v`, enqueue it and mark as visited.
4. Continue until all reachable vertices are visited.

---

## Works On

BFS can be applied to:

1. **Undirected Graphs**
2. **Directed Graphs**
3. **Connected or Disconnected Graphs**

---

## Example

### Graph:

```text
0 — 1 — 2
|         
3 — 4
```

BFS Traversal (starting from node 0):
Queue: [0]
Visited: {0}

Step 1: Dequeue 0 → Enqueue neighbors (1, 3)
Queue: [1, 3]
Visited: {0, 1, 3}

Step 2: Dequeue 1 → Enqueue neighbor (2)
Queue: [3, 2]
Visited: {0, 1, 2, 3}

Step 3: Dequeue 3 → Enqueue neighbor (4)
Queue: [2, 4]
Visited: {0, 1, 2, 3, 4}

Step 4: Dequeue 2 → No new neighbors
Queue: [4]

Step 5: Dequeue 4 → Done
Queue: []


BFS Order: 0 → 1 → 3 → 2 → 4

---

### Time and Space complexity
| Complexity Type      | Value    | Explanation                             |
| -------------------- | -------- | --------------------------------------- |
| **Time Complexity**  | O(V + E) | Every vertex and edge is processed once |
| **Space Complexity** | O(V)     | For the queue and visited array         |
