# ⚙️ AVL Tree Insertion Algorithm

When inserting into an AVL tree, we first insert the node just like in a normal Binary Search Tree (BST).  
Then, we ensure that the tree remains balanced using rotations.

---

## 📌 Algorithm

1. **Insert normally**
    - Insert the new node `n` as in a normal BST.

2. **Check balance (bottom-up)**
    - Starting from `n`, move upwards to the root.
    - For each ancestor node, calculate the **balance factor**:
      ```
      balance = height(left subtree) - height(right subtree)
      ```
    - If `balance` ∈ {-1, 0, +1}, the node is balanced → continue.
    - If `balance` ∉ {-1, 0, +1}, the node is **unbalanced** → fix it with rotations.

3. **Apply rotation rule**
    - Depending on where the imbalance occurs, use one of the **four rotation cases** to restore balance.

---

