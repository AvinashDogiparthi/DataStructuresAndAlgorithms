# 🌳 Binary Tree Traversals (Preorder, Inorder, Postorder)

A **Binary Tree** is a hierarchical data structure in which each node has at most two children:
- **Left child**
- **Right child**

---

## 📌 Example Tree

We’ll use this tree for demonstration:

               1
             /   \
           2       3
         /  \     / \
        4    5   6   7
            / \
           8   9


---

## 🔹 Preorder Traversal (Root → Left → Right)

**Steps**:
1. Visit the **root**.
2. Traverse the **left subtree**.
3. Traverse the **right subtree**.

**Traversal output for the above tree**:  
1 → 2 → 4 → 5 → 8 → 9 → 3 → 6 → 7


**✅ Use cases**:
- Copying or **cloning a tree**.
- Generating **prefix expressions** in expression trees.

---

## 🔹 Inorder Traversal (Left → Root → Right)

**Steps**:
1. Traverse the **left subtree**.
2. Visit the **root**.
3. Traverse the **right subtree**.

**Traversal output for the above tree**:  
4 → 2 → 8 → 5 → 9 → 1 → 6 → 3 → 7


**✅ Use cases**:
- In a **Binary Search Tree (BST)**, gives elements in **sorted order**.
- Used for validating if a tree is a BST.

---

## 🔹 Postorder Traversal (Left → Right → Root)

**Steps**:
1. Traverse the **left subtree**.
2. Traverse the **right subtree**.
3. Visit the **root**.

**Traversal output for the above tree**:  
4 → 8 → 9 → 5 → 2 → 6 → 7 → 3 → 1


**✅ Use cases**:
- **Deleting a tree** (children before parent).
- Generating **postfix expressions** in expression trees.
- Useful for memory cleanup (freeing nodes).

---

## 📊 Traversal Comparison

| Traversal   | Order                | Example Output                       | Common Use Case               |
|-------------|----------------------|--------------------------------------|--------------------------------|
| Preorder    | Root → Left → Right  | `1 2 4 5 8 9 3 6 7`                  | Clone tree, Prefix expression |
| Inorder     | Left → Root → Right  | `4 2 8 5 9 1 6 3 7`                  | BST sorted traversal          |
| Postorder   | Left → Right → Root  | `4 8 9 5 2 6 7 3 1`                  | Delete tree, Postfix expr     |

---