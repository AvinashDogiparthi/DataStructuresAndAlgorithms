# Two Pointers Pattern

The **Two Pointers** pattern is a powerful problem-solving technique where we use two pointers (indices, iterators, or references) to traverse a data structure like an array, linked list, or string.  
It helps optimize problems that require searching, comparing, or partitioning elements in **O(n)** or **O(n log n)** instead of brute-force **O(n²)**.

---

## Types of Two Pointers

### 1. **Two Pointers from Start and End**
- One pointer starts from the **left** (beginning) of the array/string.
- The other pointer starts from the **right** (end).
- Move them toward each other until they meet or cross.
- Useful when:
    - Array is **sorted**.
    - We need to check **pairs/triplets**.
    - Problems involving **palindromes**, **reversals**, and **partitioning**.

**Example problems:**
- Two Sum II (sorted array)
- Squares of a Sorted Array
- 3Sum / 3Sum Closest / 3Sum Smaller
- Reverse Linked List
- Reverse Vowels in a String
- Palindrome Linked List
- Reorder List

---

### 2. **Fast and Slow Pointers (Tortoise & Hare)**
- Both pointers start at the **same position**.
- **Slow pointer** moves one step at a time.
- **Fast pointer** moves two steps at a time.
- Useful when:
    - Detecting **cycles** in linked lists.
    - Finding the **middle** of a linked list.
    - Detecting **duplicates** in number sequences (e.g., Floyd’s cycle detection).
    - Optimizing problems where relative motion matters.

**Example problems:**
- Linked List Cycle / Linked List Cycle II
- Middle of the Linked List
- Happy Number
- Detecting cycles in arrays

---

## Problems Covered in This Folder

### ✅ Easy & Medium Problems
- **A_TwoSum_Easy** – Find two numbers that add up to a target using two pointers.
- **B_TwoSumII_Medium** – Two pointers on a sorted array for target sum.
- **C_Find_Duplicate** – Use cycle detection (fast & slow pointers).
- **D_Remove_Duplicate_LinkedList** – Use two pointers to clean duplicates.
- **E_SquaresOfASortedArray** – Merge results with two pointers from both ends.
- **F_MiddleOfTheLinkedList** – Use fast & slow pointers to find the middle node.
- **G_IntersectionOfTwoLinkedList** – Use two pointers switching traversal.
- **H_RemoveDuplicatesFromSortedListII** – Handle duplicates with two pointers.
- **I_ReverseLinkedList** – Iteratively reverse with pointer adjustments.
- **J_LinkedListCycle** – Detect cycle with fast & slow pointers.
- **K_LinkedListCycleII** – Find the node where cycle begins.
- **L_HappyNumber** – Use fast & slow to detect cycle in sum of squares.
- **M_PalindromeLinkedList** – Two pointers with middle split and reversal.
- **N_3Sum** – Classic two-pointer approach after sorting.
- **O_3SumClosest** – Variant of 3Sum with closest sum.
- **P_3SumSmaller** – Count triplets using sorted array and two pointers.
- **Q_SortColours_DutchNationalFlag** – Partition array with three-way pointers.
- **R_BackSpaceStringCompare** – Compare strings using two pointers backward.
- **S_ReverseVowelsInAString_NONLEETCODE** – Two pointers swap vowels.
- **T_ReorderList** – Use slow/fast pointers + merge from ends.

---

## Key Benefits of Two Pointers
- Eliminates unnecessary nested loops (**O(n)** or **O(n log n)** solutions).
- Helps in **in-place** modifications.
- Natural fit for **sorted arrays**, **linked lists**, and **strings**.

---

## Summary

| Type | Technique | Common Use Cases |
|------|-----------|------------------|
| **Start–End Pointers** | Move inward/outward | Sorting, sum problems, palindromes, partitions |
| **Fast–Slow Pointers** | Move at different speeds | Detect cycles, find middle, duplicate detection |

The **Two Pointers Pattern** is one of the most fundamental and versatile strategies in algorithms. Mastering both variations will make solving problems much faster and more intuitive.
