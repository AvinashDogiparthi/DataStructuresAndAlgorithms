# Singly Linked List – Basic Operations and Concepts

## 🧠 What is a Linked List?

A **linked list** is a linear data structure where elements (called **nodes**) are connected using pointers.

Unlike arrays, linked lists do not store elements in **contiguous memory locations**. Each node contains:

- The **data** (value)
- A **reference** (or pointer) to the **next node** in the sequence

---

## 🧠 Key Concept

In a linked list:

- Each element (node) is stored **separately in memory**
- Each node contains a **pointer to the next node**

This means:

- Nodes **do not sit next to each other** in memory
- The "links" between them are made through **pointers**

---

## 🔧 Basic Operations (Singly Linked List)

| Operation           | Time Complexity |
|---------------------|-----------------|
| Insert at head      | O(1)            |
| Insert at tail      | O(n)            |
| Delete a node       | O(n) *(if position is unknown)* |
| Search for a value  | O(n)            |

---

## 📌 Notes

- Singly linked lists
