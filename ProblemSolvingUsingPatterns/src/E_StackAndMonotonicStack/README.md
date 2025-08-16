# Monotonic Stack Explained

A **Monotonic Stack** is a special type of stack that maintains its elements in a sorted order (either increasing or decreasing) as you push and pop elements.  
It is often used to solve problems related to **"next greater element"**, **"next smaller element"**, and **"span"** problems efficiently in `O(n)` time.

---

## 1. Monotonically Decreasing Stack
A **monotonically decreasing stack** is a stack where:
- From **bottom to top**, the elements are **decreasing**.
- From **top to bottom**, the elements are **increasing**.

**Logic:**
- When you push a new element, you pop from the stack until the top of the stack is **greater than or equal to** the current element.
- This ensures the stack always has the largest values at the bottom and smaller values towards the top.

**Use cases:**
- Finding the **next greater element** to the right.
- Maintaining a set of potential candidates where each new element removes all smaller elements before it.

**Example:**  
Array = `[2, 1, 5, 3]`  
We want a monotonically decreasing stack (largest → smallest from bottom to top).

| Step | Element | Stack (top → bottom) |
|------|---------|----------------------|
| 1    | 2       | 2                    |
| 2    | 1       | 1, 2                 |
| 3    | 5       | 5                    |
| 4    | 3       | 3, 5                 |

---

## 2. Right to Left — Keep Higher People on Right
Sometimes, we process the array **from right to left** to maintain a **monotonically decreasing stack** so that:
- Every element in the stack is **taller** (or greater) than the elements below it.
- This way, for any person (or element), the stack tells you who is the **next taller person on the right**.

**Logic:**
1. Start from the **rightmost** element.
2. While the top of the stack is **less than or equal** to the current element, pop it (because a shorter person can't block the view of a taller one on the right).
3. Push the current element to the stack.
4. The stack top always contains the **next higher element** to the right.

**Example:**  
Heights = `[3, 7, 8, 3, 6, 1]`

Process right → left:

| Step | Current | Action                                            | Stack (top → bottom) | Next Higher Person on Right |
|------|---------|---------------------------------------------------|----------------------|-----------------------------|
| 1    | 1       | Push 1                                             | 1                    | None                        |
| 2    | 6       | Pop 1 → Push 6                                     | 6                    | None                        |
| 3    | 3       | 3 < 6 → Push 3                                     | 3, 6                 | 6                           |
| 4    | 8       | Pop 3, Pop 6 → Push 8                              | 8                    | None                        |
| 5    | 7       | 7 < 8 → Push 7                                     | 7, 8                 | 8                           |
| 6    | 3       | 3 < 7 → Push 3                                     | 3, 7, 8              | 7                           |

---

## Key Notes
- **Monotonically decreasing**: Stack elements decrease from bottom to top.
- **Right-to-left approach** is useful when we need the **next greater element on the right**.
- Time complexity: **O(n)** because each element is pushed and popped at most once.

---

## Reference
[Monotonic Stack Explanation - YouTube](https://www.youtube.com/watch?v=Dq_ObZwTY_Q)

