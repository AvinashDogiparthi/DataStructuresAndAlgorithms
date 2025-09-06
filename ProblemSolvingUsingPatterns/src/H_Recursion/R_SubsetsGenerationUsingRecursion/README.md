# Subsets Generation using Recursion — Step-by-step analysis

![Subsets Recursion Tree](https://github.com/AvinashDogiparthi/DataStructuresAndAlgorithms/blob/main/ProblemSolvingUsingPatterns/src/H_Recursion/R_SubsetsGenerationUsingRecursion/recursionTree.PNG)

## Problem statement

Given an array `arr = [1, 2, 3]`, generate all possible subsets (the power set) using recursion. The image above is the recursion tree we used to reason about every choice: at each element we either **reject** it (do not include) or **accept** it (include). Each root-to-leaf path corresponds to one subset.

---

## High-level idea

* Treat subset generation as a sequence of binary choices, one per element.
* For element at index `i`:

    * Branch 1 (left): **reject** `arr[i]` → do not add it to the current subset; recurse to `i + 1`.
    * Branch 2 (right): **accept** `arr[i]` → add it to the current subset; recurse to `i + 1` and then backtrack (remove it).
* When `i == n` (we passed the last element), the current subset is complete — append a copy of it to the result list.

This exactly matches the picture: each level of the tree corresponds to an index (1, 2, 3). Each node is the current subset so far. Left arrows are labelled "reject X" and right arrows "accept X" in the diagram.

---

## Invariants and important details

* **Invariant**: At any recursive call `helper(index, current)`, `current` contains some prefix subset built from elements `arr[0..index-1]`.
* When adding a subset to the result, always append a **copy** of `current` (otherwise later backtracking will mutate stored subsets).
* After the `accept` recursive call returns, **undo** (pop) the last element to restore state for other branches (backtracking).

---

## Pseudocode

```text
function generateSubsets(arr):
    result = []
    helper(0, [])
    return result

function helper(index, current):
    if index == len(arr):
        result.append(copy(current))
        return

    # 1) Reject arr[index]
    helper(index + 1, current)

    # 2) Accept arr[index]
    current.append(arr[index])
    helper(index + 1, current)
    current.pop()  # backtrack
```

---

## Detailed call-by-call trace (for `arr = [1,2,3]`)

We follow the left-first strategy shown in the picture (reject first, then accept). I'll write each recursive call and highlight when we hit the base case and add a subset to the result.

Call tree (conceptual):

```
root: helper(0, [])
├─ reject 1 -> helper(1, [])
│  ├─ reject 2 -> helper(2, [])
│  │  ├─ reject 3 -> helper(3, [])   => add []
│  │  └─ accept 3 -> helper(3, [3])  => add [3]
│  └─ accept 2 -> helper(2, [2])
│     ├─ reject 3 -> helper(3, [2])  => add [2]
│     └─ accept 3 -> helper(3, [2,3])=> add [2,3]
└─ accept 1 -> helper(1, [1])
   ├─ reject 2 -> helper(2, [1])
   │  ├─ reject 3 -> helper(3, [1])  => add [1]
   │  └─ accept 3 -> helper(3, [1,3])=> add [1,3]
   └─ accept 2 -> helper(2, [1,2])
      ├─ reject 3 -> helper(3, [1,2]) => add [1,2]
      └─ accept 3 -> helper(3, [1,2,3])=> add [1,2,3]
```

So the **order in which subsets are produced** (matching a left-to-right traversal of the tree in the picture) is:

```
[], [3], [2], [2,3], [1], [1,3], [1,2], [1,2,3]
```

(Each `=> add ...` line above is when we reach the base case and push a copy of the `current` subset into `result`.)

> Note: Depending on whether you choose to recurse `accept` first or `reject` first, or depending on whether you append the subset at entry or exit, the *order* of generated subsets may differ — but the set of subsets will always be the same (the power set).

---

## Call-stack example (first few calls)

* Start: `helper(0, [])`

    * `helper(1, [])` (reject 1)

        * `helper(2, [])` (reject 2)

            * `helper(3, [])` (reject 3) -> base case -> add `[]`
            * return to `helper(2, [])`
            * `helper(3, [3])` (accept 3) -> base case -> add `[3]`
        * return to `helper(1, [])`
        * `helper(2, [2])` (accept 2)

            * `helper(3, [2])` -> add `[2]`
            * `helper(3, [2,3])` -> add `[2,3]`
    * return to `helper(0, [])`
    * `helper(1, [1])` (accept 1) ... continue similarly

This demonstrates how recursion + backtracking neatly explores all combinations without needing explicit loops for every level.

---

## Complexity

* Time complexity: `O(n * 2^n)` — there are `2^n` subsets and each subset requires up to `O(n)` time to copy into the result.
* Space complexity:

    * Auxiliary recursion stack: `O(n)` (maximum depth is `n`).
    * Output storage: `O(n * 2^n)` to store all subsets.

---

## Common pitfalls / tips

* **Always push a copy** of `current` into the result at the base case (or build a new list to store). If you push the reference, later backtracking changes will mutate stored entries.
* Remember to **pop** after the accept-branch to backtrack.
* If you want subsets in lexicographic order, you may need to sort the input first and decide a traversal order.

---

## Implementations

### Python (concise)

```python
def subsets(arr):
    res = []
    def helper(i, cur):
        if i == len(arr):
            res.append(cur[:])
            return
        # reject
        helper(i+1, cur)
        # accept
        cur.append(arr[i])
        helper(i+1, cur)
        cur.pop()
    helper(0, [])
    return res

# Example
print(subsets([1,2,3]))
```

### Java

```java
import java.util.*;

public class Subsets {
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), res);
        return res;
    }

    private static void helper(int[] arr, int index, List<Integer> cur, List<List<Integer>> res) {
        if (index == arr.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        // reject
        helper(arr, index + 1, cur, res);
        // accept
        cur.add(arr[index]);
        helper(arr, index + 1, cur, res);
        cur.remove(cur.size() - 1); // backtrack
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
```

---

## Summary

The picture shows a binary recursion tree where each level corresponds to a decision about one element. Reading the tree left-to-right and collecting subsets at leaves mirrors a recursive implementation that first tries the "reject" branch, then the "accept" branch, and uses backtracking to restore state after each accept. This approach is simple, easy to reason about, and scales directly to larger `n` (with `2^n` growth in output size).
