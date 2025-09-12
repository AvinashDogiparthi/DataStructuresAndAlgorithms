# Backtracking

## What is Backtracking?
Backtracking is a **systematic way of trying out different sequences of decisions** until you find all (or some) valid solutions.

Think of it as a **depth-first search (DFS) with undo**:
- You make a choice (add something to the current solution).
- You explore further with recursion.
- If the choice does not lead to a valid solution, you **undo (backtrack)** and try the next option.

This approach is commonly used for problems involving:
- **Combinations** (choose `k` out of `n`).
- **Subsets** (all possible subsets).
- **Permutations** (arrangements of numbers).
- **Parentheses generation / string formation**.
- **Constraint problems** (like Sudoku, N-Queens, Word Search).

---

## Key Idea
At each step:
1. **Choose** → add a candidate element to the current path.
2. **Explore** → recurse with the updated state.
3. **Un-choose (Backtrack)** → remove the element before moving to the next candidate.

This ensures we explore **all possible paths** without permanently modifying the state.

---

## General Backtracking Template
This is the **template pattern** we reuse across problems:

```java
void backtrack(List<List<Integer>> result, List<Integer> path, int start, int n, int k) {
    // 1. Base Case: if path is a valid solution, add it to result
    if (path.size() == k) {
        result.add(new ArrayList<>(path));
        return;
    }

    // 2. Explore all candidates
    for (int i = start; i <= n; i++) {
        // Choose
        path.add(i);

        // Explore (recurse)
        backtrack(result, path, i + 1, n, k);

        // Un-choose (Backtrack)
        path.remove(path.size() - 1);
    }
} 
```

## Breakdown of Template
- Base Case: Decide when to stop recursion (e.g., path length = k, string length = 2*n, etc.).
- Loop: Iterate over possible choices at the current step.
- Choose → Recurse → Un-choose: Classic backtracking cycle.

## When to Use Backtracking
- When the problem asks for all possible solutions (not just one).
- When you can build a solution incrementally and discard partial solutions that won’t work.
- When you need to explore a search space with constraints.

## Complexity Considerations
- Time Complexity: Depends on the total number of solutions × cost of building each solution.
Example: O(C(n, k) * k) for combinations, O(2^n * n) for subsets.
- Space Complexity: Mainly recursion depth (O(k) or O(n)), plus space for storing results.


