# AVL Tree vs Binary Search Tree (BST)

## Problem with a Normal Binary Search Tree (BST)

A **Binary Search Tree (BST)** organizes data so that:
- Left child < Parent
- Right child > Parent

However, if elements are inserted in **sorted order**, the tree becomes **skewed** (like a linked list).

Example: Insert `[10, 20, 30, 40, 50]` into a BST.

BST (Skewed to the Right):
```text
  10
    \
      20 
        \
         30
            \
             40
               \
                50
```



### Problem:
- Height of the tree becomes **O(n)** (worst case).
- Search, insert, delete operations degrade from **O(log n)** to **O(n)**.
- Essentially, a skewed BST loses its advantage over arrays or linked lists.

---

## Solution: AVL Tree

An **AVL Tree** is a **self-balancing Binary Search Tree**.
- For every node, the **balance factor** = `height(left subtree) - height(right subtree)` must be **-1, 0, or +1**.
- If balance factor goes outside this range, **rotations** (LL, RR, LR, RL) are performed to restore balance.

Example: Insert `[10, 20, 30, 40, 50]` into an AVL tree.

Balanced AVL Tree:

```text
    30
   /  \
 20    40
/       \

```

### Benefits:
- Height of AVL tree is always **O(log n)**.
- Search, insert, and delete operations always take **O(log n)**.
- Prevents skewness, ensuring efficiency for large datasets.

---

## Use Cases of AVL Trees

1. **Databases & Indexing**
    - Ensures fast lookups, insertions, and deletions.
    - Commonly used in systems requiring **range queries**.

2. **Memory Management (OS)**
    - Used in paging and process scheduling for maintaining balanced search structures.

3. **Routing Tables in Networking**
    - Fast IP lookup due to balanced height.

4. **File Systems**
    - Used in situations where read/write operations must be efficient.

5. **Gaming & AI Search**
    - Ensures quick decision tree evaluations with balanced search trees.

---

## AVL vs Normal BST

| Feature                 | Normal BST (Worst Case) | AVL Tree |
|--------------------------|--------------------------|----------|
| Height                   | O(n)                    | O(log n) |
| Search Complexity        | O(n)                    | O(log n) |
| Insertion Complexity     | O(n)                    | O(log n) |
| Deletion Complexity      | O(n)                    | O(log n) |
| Balancing                | ❌ No                   | ✅ Yes    |

---

## Key Takeaway

- A **Binary Search Tree** may degrade into a **linked list** in the worst case.
- An **AVL Tree** guarantees balance using rotations, ensuring operations remain efficient (**O(log n)**).
- AVL trees are best suited for scenarios with **frequent lookups** and **moderate insert/delete operations**.