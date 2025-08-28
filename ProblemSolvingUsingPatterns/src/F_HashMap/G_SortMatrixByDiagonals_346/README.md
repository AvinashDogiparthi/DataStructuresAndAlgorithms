# 3446. Sort Matrix by Diagonals

🔗 [LeetCode Problem Link](https://leetcode.com/problems/sort-matrix-by-diagonals/)

---

## Problem Statement

You are given an `n x n` square matrix of integers `grid`.  
Return the matrix such that:

- The **diagonals** in the **bottom-left triangle** (including the middle diagonal) are sorted in **non-increasing** order.
- The **diagonals** in the **top-right triangle** are sorted in **non-decreasing** order.

---

## Examples

### Example 1:
**Input:**
```text
grid = [[1,7,3],
        [9,8,2],
        [4,5,6]]
```

**Output:**
```text
[[8,2,3],
 [9,6,7],
 [4,5,1]]
```

**Explanation:**
```text
The diagonals with a black arrow (bottom-left triangle) should be sorted in non-increasing order:

[1, 8, 6] → [8, 6, 1]

[9, 5] and [4] remain unchanged.

The diagonals with a blue arrow (top-right triangle) should be sorted in non-decreasing order:

[7, 2] → [2, 7]

[3] remains unchanged.
```


### Example 2:
**Input:**
```text
grid = [[0,1],
        [1,2]]
```

**Output:**
```text
[[2,1],
 [1,0]]
```

**Explanation:**
```text
The diagonals in the bottom-left must be non-increasing, so [0, 2] → [2, 0].

The other diagonals remain unchanged.
```

### Example 3:
**Input:**
```text
grid = [[1]]
```

**Output:**
```text
[[1]]
```

**Explanation:**
```text
Explanation:

Diagonals with exactly one element are already sorted.
```

### Constraints :
grid.length == grid[i].length == n
1 <= n <= 10
-10^5 <= grid[i][j] <= 10^5


