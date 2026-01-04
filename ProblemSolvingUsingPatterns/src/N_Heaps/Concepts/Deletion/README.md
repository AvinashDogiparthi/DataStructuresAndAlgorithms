# Deletion in MinHeap

This document explains **how to remove an element from a MinHeap** using the  
**downHeap method** (also called **sink-down / heapify-down**), with a **clear step-by-step pictorial explanation**.

We will **remove the minimum element (root)** from the MinHeap built earlier.

---

## MinHeap Rules (Reminder)

- **Minimum element is always at the root**
- It is a **Complete Binary Tree**
- **Parent ≤ Children**
- Stored using an **array (0-based indexing)**

---

## downHeap (Sink-Down) Logic

When removing the minimum element:
1. **Remove the root**
2. **Move the last element to the root**
3. Compare it with its **smallest child**
4. If larger, **swap**
5. Repeat until heap property is restored

---

## Step-by-Step Deletion
Array : [5, 8, 7, 11, 12, 14, 9]

Tree : 
```text
        5
      /   \
     8     7
    / \   / \
  11 12 14  9
```

### Step 1: Remove Root (5)
```text
Removed element = 5
Move last element (9) to root.

Array : [9, 8, 7, 11, 12, 14]

Tree :
        9
      /   \
     8     7
    / \   /
  11 12 14
```
### Step 2: Compare with children

```text
Children of 9 → 8 and 7
Smallest = 7
9 > 7 → swap

Array : [7, 8, 9, 11, 12, 14]

Tree : 
        7
      /   \
     8     9
    / \   /
  11 12 14
```

### Step 3: Continue downHeap

```text
Children of 9 → 14
9 < 14 → stop


Heap property restored

🎯 Final MinHeap After Deletion
Array : [7, 8, 9, 11, 12, 14]

Tree : 
        7
      /   \
     8     9
    / \   /
  11 12 14
```

