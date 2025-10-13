# Graph Data Structure

A **graph** is a fundamental data structure in computer science that represents a set of **nodes (vertices)** and the **connections (edges)** between them. Graphs are widely used to model real-world relationships and networks.

A graph is typically defined as:

**G(V, E)**  
Where:
- **V** → Set of vertices (nodes)
- **E** → Set of edges (connections between nodes)

---

## Real-World Examples

| Scenario        | Vertices (Nodes) | Edges (Connections)           |
|-----------------|-----------------|------------------------------|
| Social Network  | Users           | Friend connections           |
| Google Maps     | Locations       | Roads                        |
| Web Pages       | Pages           | Hyperlinks                   |

---

## Terminology

| Term                 | Meaning                                             | Example                                 |
|----------------------|-----------------------------------------------------|-----------------------------------------|
| **Vertex (Node)**     | A point in the graph                                | A city in a map                         |
| **Edge**              | Connection between two vertices                     | A road between two cities               |
| **Degree**            | Number of edges connected to a vertex              | Node with 3 friends → degree = 3       |
| **Path**              | Sequence of connected vertices                     | A → B → C                               |
| **Cycle**             | Path that starts and ends at the same vertex      | A → B → C → A                           |
| **Connected Graph**   | Every vertex is reachable from any other vertex   | A social network where everyone is connected |
| **Component**         | A disconnected part of a graph                     | Multiple isolated groups in a network   |

---

## Detailed Explanation

### Vertices (Nodes)
Vertices represent the entities in a graph. They can be anything depending on the scenario — users, cities, webpages, etc.

### Edges
Edges represent relationships or connections between vertices. Edges can be **directed** (one-way) or **undirected** (two-way).

### Degree
The degree of a vertex indicates the number of edges connected to it.
- **In-degree**: Number of edges coming into a vertex (for directed graphs)
- **Out-degree**: Number of edges going out from a vertex (for directed graphs)

### Path
A path is a sequence of vertices where each adjacent pair is connected by an edge.

### Cycle
A cycle is a path where the first and last vertices are the same, forming a loop.

### Connected Graph
A graph is **connected** if there exists a path between every pair of vertices.

### Component
A graph component is a subgraph in which all vertices are connected to each other but not to vertices outside the component.

---

## Summary

Graphs are versatile structures that model relationships between entities. Understanding vertices, edges, paths, cycles, connectivity, and components is essential for solving real-world problems such as social networks, mapping systems, and web navigation.
