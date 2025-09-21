# 🔍 Breadth First Search (BFS)

## 📌 What is BFS?

**Breadth First Search (BFS)** is a graph/tree traversal algorithm that explores **all nodes at the present depth level before moving to the next level**.

- It starts from a **source node**.
- Visits all neighbors first.
- Then moves to neighbors of neighbors, and so on.

👉 BFS is implemented using a **queue** (FIFO).

---

## 📊 How BFS Works

1. Start from a source node.
2. Put it in a queue and mark as visited.
3. While the queue is not empty:
    - Remove the front node from the queue.
    - Visit all **unvisited neighbors** of this node.
    - Add those neighbors to the queue.
4. Repeat until the queue is empty.

---

## 📚 Example: BFS on a Graph

Graph:

```text

        1
       / \
      2   3
     / \
    4   5


```

### BFS Traversal (starting from node `1`):
1. Start from the root node 1, add it to the queue.
2. Pop from the queue → visit node 1, then add its children (2, 3) to the queue.
3. Pop from the queue → visit node 2, then add its children (4, 5) to the queue.
4. Pop from the queue → visit node 3 (no children).
5. Pop from the queue → visit node 4 (no children).
6. Pop from the queue → visit node 5 (no children).

✅ BFS Order = **1 → 2 → 3 → 4 → 5**

---

## Example: BFS on a Binary Tree
```text
    1
   / \
  2   3
 / \   \
4   5   6

```

### BFS Traversal:
- Level 1: `1`
- Level 2: `2, 3`
- Level 3: `4, 5, 6`

✅ BFS Order = **1 → 2 → 3 → 4 → 5 → 6**

### When to use BFS
- When answer lies near the root
- When you are asked to do something related to level
