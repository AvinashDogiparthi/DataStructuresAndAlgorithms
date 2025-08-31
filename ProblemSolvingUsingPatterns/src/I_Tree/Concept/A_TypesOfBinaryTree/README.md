### Types of Binary Trees


### 1. Complete Binary Tree
- A **Complete Binary Tree** is a binary tree where:
    - All levels are completely filled **except possibly the last level**.
    - The **last level is filled from left to right** (no gaps in between).  

**Example ( Complete Binary Tree ):**
```text
    A
   / \
  B   C
 / \  /
D   E F
```
✅ This is a **Complete Binary Tree** because:
- Levels 0 and 1 are completely full.
- Level 2 is filled from **left to right** (`D, E, F`).  

**Example ( NOT a Complete Binary Tree ):**
```text
    A
   / \
  B   C
 /     \
D       E
```
❌ This is **NOT a Complete Binary Tree** because the last level is **not filled from left to right** (`B` has a left child but missing right before `E` appears).

---


### 2. Full Binary Tree
- A **Full Binary Tree** (also called a **Strict Binary Tree**) is a binary tree where:
  - Each node has **either 0 or 2 children**.
  - No node can have only **one child**.

**Example ( Full Binary Tree ):**
```text
    A
   / \
  B   C
 / \  / \
D   E F  G
```
✅ This is a **Full Binary Tree** because:
- Every node has either **0 children** (leaf nodes `D, E, F, G`) or **2 children** (`A, B, C`).

**Example ( NOT a Full Binary Tree ):**
```text
    A
   / \
  B   C
 /
D
```
❌ This is **NOT a Full Binary Tree** because:
- Node `B` has only **one child (D)**, which violates the rule.  
---

### 3. Perfect Binary Tree
- A **Perfect Binary Tree** is a binary tree where:
  - All **internal nodes** have exactly **2 children**.
  - All **leaf nodes** are at the **same level**.

**Example ( Perfect Binary Tree ):**
```text
    A
   / \
  B   C
 / \  / \
D   E F  G
```
✅ This is a **Perfect Binary Tree** because:
- Internal nodes (`A, B, C`) each have exactly **2 children**.
- All leaf nodes (`D, E, F, G`) are at the **same level (Level 2)**.

**Example ( NOT a Perfect Binary Tree ):**
```text
    A
   / \
  B   C
 / \
D   E
```
❌ This is **NOT a Perfect Binary Tree** because:
- Node `C` does not have **2 children**.
- Leaf nodes (`D, E`) are at **Level 2**, but `C` is a leaf at **Level 1**, so all leaves are **not at the same level**.  
---


### 4. Height Balanced Binary Tree
- A **Height Balanced Binary Tree** is a binary tree where:
  - The **height difference** between the left and right subtrees of **any node** is at most **1**.
  - This keeps the tree **balanced** and prevents it from becoming skewed.
  - The **average height** of a balanced tree is **O(log N)**, where `N` is the number of nodes.

**Example ( Height Balanced Binary Tree ):**
```text
    A
   / \
  B   C
 / \
D   E
```
✅ This is a **Height Balanced Tree** because:
- For every node, the difference between the heights of the left and right subtrees ≤ 1.
- Height ≈ **O(log N)** (efficient for searching, insertion, deletion).

**Example ( NOT a Height Balanced Binary Tree ):**
```text
    A
   /
  B
 /
C
```

❌ This is **NOT height balanced** because:
- Node `A` has left subtree height = 3, right subtree height = 0 → difference = 3 (> 1).
- This is a **skewed tree** with height = **O(N)** instead of O(log N).  
---


### 5. Ordered Binary Tree (Binary Search Tree - BST)
- An **Ordered Binary Tree** is a binary tree where:
  - Every node follows a specific **ordering property**.
  - The most common example is the **Binary Search Tree (BST)**.
- **Binary Search Tree property**:
  - The **left child** of a node contains values **less than** the parent.
  - The **right child** of a node contains values **greater than** the parent.
  - No duplicate values (in standard BST).

**Example ( Valid BST ):**
```text
    8
   / \
  3   10
 / \     \
1   6     14
   / \    /
  4   7  13
```
- Left of `8` = values `< 8` (`3, 1, 6, 4, 7`)
- Right of `8` = values `> 8` (`10, 14, 13`)
- Each subtree also follows the BST rule.

**Example ( NOT a Valid BST ):**
```text
    8
   / \
  3   10
     /
    2
```
- ❌ Invalid because `2` is in the **right subtree of 8** but it is **less than 8**.
---


