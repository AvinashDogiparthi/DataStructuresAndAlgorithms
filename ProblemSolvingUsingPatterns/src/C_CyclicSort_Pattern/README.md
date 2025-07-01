# 🔄 Cyclic Sort – Explained

Cyclic Sort is a highly efficient **in-place** sorting algorithm, ideal for problems involving arrays with elements from `1 to n` or `0 to n-1`. It ensures each element is placed at its correct index by performing a minimal number of swaps.

---

## 🎯 When to Use Cyclic Sort

- The array contains `n` distinct elements in the range `1 to n` (or `0 to n-1`)
- Problems require **finding missing/duplicate** elements in such arrays
- You want **O(n)** time complexity with **O(1)** space

---

## 📦 Concept

For an array where values range from `1 to n`, each element should ideally be at index `value - 1`.

The algorithm keeps swapping an element with the one at its correct index until every element is in its right position.

---

---

## 📉 Worst-Case Swap Analysis

In the **worst-case scenario**, Cyclic Sort performs **`n - 1` swaps**, where `n` is the length of the array.

### 🔍 Why?

- Each swap places at least one element in its correct position.
- After each successful swap, one element reaches its target index.
- So, in the worst case, all but one element need to be moved → **`n - 1` swaps**.

---


## 🧩 Common Problems Solved Using Cyclic Sort

Cyclic Sort is especially useful in solving array problems that involve finding missing, duplicate, or misplaced elements in `O(n)` time with constant space.

Here are some popular LeetCode problems that can be efficiently solved using this pattern:

---

### 🔹 [LeetCode 268 – Missing Number](https://leetcode.com/problems/missing-number/)
> Given an array containing `n` distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing.

**Cyclic Sort Insight:** Place each number at index equal to its value. The index that doesn’t match its value gives the missing number.

---

### 🔹 [LeetCode 442 – Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
> All elements appear once or twice. Find all elements that appear exactly twice.

**Cyclic Sort Insight:** Place numbers in their correct index and detect cycles or duplicates when two numbers clash for the same index.

---

### 🔹 [LeetCode 645 – Set Mismatch](https://leetcode.com/problems/set-mismatch/)
> One number is duplicated and another is missing. Find both.

**Cyclic Sort Insight:** Reorganize numbers to their correct index. When `arr[i] != i + 1`, check for mismatches or duplicates.

---

### 🔹 [LeetCode 41 – First Missing Positive](https://leetcode.com/problems/first-missing-positive/)
> Find the smallest missing positive integer in an unsorted array.

**Cyclic Sort Insight:** Ignore negatives and values > n. Place each positive number at its correct index, then scan to find the first mismatch.

---

📌 These problems follow a common structure:
- Numbers are bounded in the range `[1, n]` or `[0, n-1]`
- Efficient rearrangement can be done using constant space
- Linear time solution is possible by placing elements in their correct position

---

## 🧠 Algorithm

```java
for (int i = 0; i < arr.length; ) {
    int correctIndex = arr[i] - 1;
    if (arr[i] != arr[correctIndex]) {
        swap(arr, i, correctIndex);
    } else {
        i++;
    }
}

---

