### 🌳 Trees in Data Structures
A Tree is a hierarchical data structure consisting of nodes connected by edges.
```text
It is used in : 
1) File systems
2) Databases
3) Algorithms / Networking
4) Maths
5) Decision Trees --> Machine Learning
6) Compression of files --> Huffman coding
7) Future Data structures like heap

```

### Tree
- A **Tree** is made up of **nodes**.
- The **topmost node** is called the **Root**.
- Every node can have **0 or more child nodes**.
```text
        A   <-- Root
       / \
      B   C
     / \
    D   E
```

### Parent and Child
- Parent: A node that has child nodes.
- Child: Nodes that descend from a parent.
```text
        A
       / \
      B   C
     / \
    D   E
```
Here:
- A is the parent of B and C.
- B is the parent of D and E.
- D and E are children of B.

### Siblings
- Siblings: Nodes that share the same parent.
```text
        A
       / \
      B   C
     / \
    D   E
```
- B and C are siblings (same parent A).
- D and E are siblings (same parent B).

### Edge
- An Edge is the connection between two nodes.
```text
        A
       / \
      B   C
```
- The connections (A-B) and (A-C) are edges.


### Leaf Node
- A Leaf Node is a node with no children.
```text
        A
       / \
      B   C
     / \
    D   E
```
- Leaf nodes here are: C, D, and E.


### Height of a Node
- The height of a node = maximum number of edges from that node down to a leaf node.
```text
        A
       / \
      B   C
     / \
    D   E
```
- Height(D) = 0 (leaf node).
- Height(B) = 1 (B → D or E).
- Height(A) = 2 (A → B → D).


### Level of a Node
- The Level of a node = number of edges from the root to that node.
- The root is always at Level 0.
```text
        A  (Level 0)
       / \
      B   C  (Level 1)
     / \
    D   E    (Level 2)
```
- Level(A) = 0
- Level(B) = 1
- Level(D) = 2