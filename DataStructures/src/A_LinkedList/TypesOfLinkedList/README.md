# Types of Linked Lists

Linked lists are fundamental data structures where each element (node) contains data and a reference (pointer) to the next node. There are several types of linked lists, each with its own characteristics and use cases:

---

## 1. Singly Linked List

- **Structure:** Each node contains data and a pointer/reference to the **next** node.
- **Traversal:** Can only be traversed in one direction — from the head to the tail.
- **Use case:** Simple and efficient when you only need forward traversal.
- **Operations:**
    - Insertion and deletion at the head are fast (O(1)).
    - Insertion/deletion at the tail or middle requires traversal (O(n)).

---

## 2. Doubly Linked List

- **Structure:** Each node contains data, a pointer to the **next** node, and a pointer to the **previous** node.
- **Traversal:** Can be traversed in both directions — forward and backward.
- **Use case:** Useful when bi-directional traversal is required, such as in navigation systems or undo-redo functionality.
- **Operations:**
    - Insertion and deletion at both ends are efficient (O(1)).
    - Slightly more memory overhead due to an extra pointer.

---

## 3. Circular Linked List

- **Structure:** Similar to singly or doubly linked lists, but the last node points back to the first node, forming a circle.
- **Traversal:** Can start from any node and continue indefinitely because of the circular connection.
- **Types:**
    - **Singly Circular Linked List:** Last node points to the first node, but nodes only have next pointers.
    - **Doubly Circular Linked List:** Both next and previous pointers, with the last node linking back to the first and vice versa.
- **Use case:** Ideal for applications requiring continuous looping, such as in round-robin scheduling or buffering.
- **Operations:**
    - Similar to their non-circular counterparts but must handle the circular condition carefully.

---

## Summary Table

| Type                   | Pointer(s) per Node     | Traversal Direction      | Circular?   | Use Cases                             |
|------------------------|------------------------|-------------------------|-------------|-------------------------------------|
| Singly Linked List      | Next                   | Forward only            | No          | Simple forward traversal             |
| Doubly Linked List      | Next, Previous         | Forward & Backward      | No          | Bi-directional traversal             |
| Circular Linked List    | Next (or Next & Prev)  | Circular, continuous    | Yes         | Continuous looping, scheduling       |

---

Feel free to explore the implementation of each type to understand their behaviors better!
