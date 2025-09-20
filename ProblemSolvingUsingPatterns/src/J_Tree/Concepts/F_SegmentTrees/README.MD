# Segment Tree

## What is a Segment Tree?

A **Segment Tree** is a **full binary tree** that stores information about intervals (subarrays) and allows efficient range queries and updates.

- Each **leaf node** represents a single element of the array.
- Each **internal node** represents a range (interval) of the array and stores some information (like sum, min, max, etc.) about that interval.

👉 The key advantage: **range queries and updates** can be done in **O(log N)** time instead of **O(N)**.

---

## Example

Consider array:  
a = [1, 6, 8, 2, 7, 16]


We want to query the **sum of elements between two indices** efficiently.

---

### ❌ Naive Approach
- Use a loop or two pointers.
- Worst-case time complexity: **O(N)** per query.
- Not efficient if there are many queries.

---

### ✅ Segment Tree Approach
- Build a tree where each node stores the **sum of a segment of the array**.
- Querying any subarray sum takes **O(log N)**.
- Updating a value also takes **O(log N)**.

---

## 🌳 Structure of Segment Tree

For array `a = [1, 6, 8, 2, 7, 16]`


```text
Segment Tree for a = [1,6,8,2,7,16]

                          [1,6,8,2,7,16] (Sum = 40)
                          /                           \
             [1,6,8] (Sum = 15)                 [2,7,16] (Sum = 25)
              /              \                     /              \
     [1,6] (7)            [8] (8)          [2,7] (9)           [16] (16)
      /    \                                  /    \
 [1] (1)  [6] (6)                       [2] (2)  [7] (7)

```

- Root node represents the whole array `[0..5]`.
- Left child represents `[0..2]`, right child `[3..5]`, and so on.
- Leaf nodes represent single elements.  

---

## ⚙️ Operations

### 1. **Build Segment Tree**
- Build the tree from the array.
- Time Complexity: **O(N)**.

### 2. **Range Query**
- Query sum, min, max, product, etc. in range `[L..R]`.
- Time Complexity: **O(log N)**.

### 3. **Update**
- Update an element in the array and reflect changes in the tree.
- Time Complexity: **O(log N)**.

---

## Example Query

Find sum of range `[1, 4]` in array `[1,6,8,2,7,16]`.

- Traverse nodes that fully or partially cover the interval.
- `[1,6,8] (15)` covers `[1,2]` → contributes 14.
- `[2,7] (9)` covers `[3,4]` → contributes 9.
- Total = **23**.

---

## Use Cases

Segment Trees are useful when we need to perform **frequent queries and updates on ranges**:

1. **Range Sum Queries**
    - Sum of elements in `[L..R]`.

2. **Range Minimum/Maximum Query (RMQ)**
    - Find min or max in `[L..R]`.

3. **Range Product Query**
    - Product of elements in `[L..R]`.

4. **Range Average**
    - Using sum and length, compute average.

5. **Dynamic Updates**
    - If array values change often, Segment Trees handle updates efficiently.

---

## Time Complexity

| Operation   | Complexity |
|-------------|------------|
| Build Tree  | O(N)       |
| Query Range | O(log N)   |
| Update      | O(log N)   |

---