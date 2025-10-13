# Graph Representation

Graphs can be represented mainly in **two ways**:

---

## 1) Adjacency Matrix

- **Description:**  
  An adjacency matrix is a **V × V 2D array** where `V` is the number of vertices in the graph. The element at row `i` and column `j` represents the presence or absence (and sometimes weight) of an edge between vertex `i` and vertex `j`.

- **Details:**
    - If there is an edge between vertex `i` and vertex `j`, `matrix[i][j] = 1` (or the weight of the edge).
    - If there is no edge, `matrix[i][j] = 0`.
    - For **undirected graphs**, the matrix is **symmetric** because an edge from `i` to `j` implies an edge from `j` to `i`.
    - For **directed graphs**, the matrix may not be symmetric.

- **Example (Undirected Graph):**

```text
0 — 1
|
2
```


Adjacency Matrix:

```text
    0 1 2
0 [ 0 1 1 ]
1 [ 1 0 0 ]
2 [ 1 0 0 ]

```

- **Pros:**
    - Easy to check if an edge exists between two vertices.
- **Cons:**
    - Uses O(V²) space, which can be large for sparse graphs.

---

---

## 2) Adjacency List

- **Description:**  
  An adjacency list represents a graph as an array of lists. The array index represents the vertex, and each element in the list represents the vertices connected to it.

- **Example (Undirected Graph):**

```text
0 — 1
|
2
```

Adjacency List:

```text
0: 1, 2
1: 0
2: 0
```

- **Pros:**
    - More space-efficient for sparse graphs.
    - Easy to iterate over all neighbors of a vertex.
- **Cons:**
    - Checking if an edge exists between two vertices may take O(V) time.

---

### Summary

| Representation      | Space Complexity | Best Use Case                       |
|--------------------|----------------|------------------------------------|
| Adjacency Matrix    | O(V²)          | Dense graphs                       |
| Adjacency List      | O(V + E)       | Sparse graphs                       |
