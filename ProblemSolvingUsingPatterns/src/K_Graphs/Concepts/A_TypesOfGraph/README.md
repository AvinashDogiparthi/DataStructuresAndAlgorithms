# Types of Graphs

Graphs are used to represent relationships between entities. Based on different properties, graphs can be classified into several types. Below is a detailed explanation of the commonly used graph types:

---

## 1) Undirected Graph

- **Description:** Edges do not have a direction. The connection between two vertices is mutual.
- **Example:** Friendship network — if A is a friend of B, then B is also a friend of A.
- **Visualization:**
```text
A — B
|
C
```
- **Vertices:** A, B, C
- **Edges:** (A-B), (A-C)

---

## 2) Directed Graph (Digraph)

- **Description:** Edges have a direction, going from one vertex to another.
- **Example:** Twitter following — if A follows B, B may not follow A.
- **Visualization:**
```text
A → B
↑
C
```


---

## 3) Weighted Graph

- **Description:** Each edge has a weight or cost associated with it, representing distance, cost, or time.
- **Example:** Google Maps — distances between locations.
- **Visualization:**

```text
A —5— B
|
2
C
```
*(Numbers on edges represent weights)*

---

## 4) Unweighted Graph

- **Description:** Edges do not have any weight. All connections are equal.
- **Example:** Basic social network showing only friendships.
- **Visualization:**

```text
A — B
|
C
```


---

## 5) Cyclic Graph

- **Description:** A graph that contains at least one cycle (a path starting and ending at the same vertex).
- **Example:** A → B → C → A
- **Visualization:**
```text
A → B → C
↑ |
└-------┘
```

---

## 6) Acyclic Graph

- **Description:** A graph that does not contain any cycles.
- **Example:** Task scheduling dependencies, family trees.
- **Visualization:**

```text
A → B →C
```


---

## 7) Connected Graph

- **Description:** Every vertex is reachable from any other vertex through some path.
- **Example:** A social network where all users are connected.
- **Visualization:**

```text
A — B — C
|
D
```


---

## 8) Disconnected Graph

- **Description:** Some vertices are not connected to others; the graph has multiple isolated parts.
- **Example:** Multiple isolated groups of friends in a social network.
- **Visualization:**

```text
A — B  C — D
```


---

## 9) Bipartite Graph

- **Description:** Vertices can be divided into two disjoint sets such that every edge connects a vertex from one set to the other. No edge connects vertices within the same set.
- **Example:** Job assignment — Set 1: Workers, Set 2: Tasks.
- **Visualization:**
```text
Set1: A, B
Set2: 1, 2
Edges: A→1, A→2, B→1
```

