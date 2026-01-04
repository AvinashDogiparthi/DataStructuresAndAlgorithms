# Why Heaps?

A **Heap** is a powerful data structure used when you frequently need to retrieve an element that follows a **specific priority or criteria**, such as the **smallest** or **largest** element.

---

## Why Do We Need Heaps?

### Problem Scenario
Suppose you store 10 numbers and want to find the **smallest number**.

### Normal Approach
- Store elements in an array
- Iterate through all elements to find the minimum

⏱ **Time Complexity:** `O(N)`

---

### Heap Approach
- Store elements in a **Min Heap**
- The smallest element is always at the **root**

⏱ **Time Complexity:**
- **Peek (get min/max):** `O(1)`
- **Insert / Delete:** `O(log N)`

This makes heaps ideal for **priority-based problems**.

---

## ⚙️ How Does a Heap Work?

### 1️⃣ Complete Binary Tree
- A heap is a **complete binary tree**
- All levels are fully filled except possibly the last
- Nodes are filled from **left to right**

> ⚠️ Although it looks like a tree conceptually, **heaps are stored internally using arrays**

---

### 2️⃣ Heap Property

#### 🔸 Max Heap
- Every parent node value is **greater than or equal to** its children
- The **maximum element** is always at the root

#### 🔸 Min Heap
- Every parent node value is **less than or equal to** its children
- The **minimum element** is always at the root

---

### 3️⃣ Root Property (Max Heap Example)
- The **maximum element** is always at the top
- Accessing it takes **O(1)** time

---

## 📐 Heap Indexing & Formulae

Unlike a traditional tree, a heap:
- Does **not** use `left`, `right`, or `next` pointers
- Uses **array indexing** to represent parent-child relationships

> Assuming **1-based indexing**:

```text
Root index = i = 1
Parent(i) = i / 2
Left Child(i) = 2 * i
Right Child(i) = 2 * i + 1
```


📌 (For 0-based indexing, formulas slightly change.)

---

## 🌲 Height of a Heap

Since a heap is a **complete binary tree**:

Height = O(log N)

This is why:
- Insert
- Delete
- Heapify

all take **logarithmic time**

---

## Summary

| Feature | Heap |
|------|------|
| Structure | Complete Binary Tree |
| Storage | Array |
| Access Min/Max | O(1) |
| Insert | O(log N) |
| Delete | O(log N) |
| Height | O(log N) |

---

## When to Use Heaps?

- Finding **minimum / maximum**
- **Top K** problems
- **Priority queues**
- **Streaming data**
- **Scheduling / Greedy algorithms**
