# 1457. Pseudo-Palindromic Paths in a Binary Tree

🔗 Problem Link: [LeetCode - Pseudo-Palindromic Paths in a Binary Tree](https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/)

---

## Problem Statement

Given a binary tree where node values are digits from `1` to `9`.

A path in the binary tree is called **pseudo-palindromic** if at least one permutation of the node values in the path can form a palindrome.

Return the number of **pseudo-palindromic paths** going from the root node to leaf nodes.

---

## What is a Pseudo-Palindromic Path?

A sequence can be rearranged to form a palindrome if:

* At most **one digit** occurs an odd number of times.
* All other digits must occur an even number of times.

For example:

```text
[2, 3, 3, 2]
```

Frequencies:

```text
2 → 2 times
3 → 2 times
```

All frequencies are even.

Therefore, it can form:

```text
2 3 3 2
```

So it is pseudo-palindromic.

Another example:

```text
[2, 3, 3, 2, 4]
```

Frequencies:

```text
2 → 2
3 → 2
4 → 1
```

Only one digit has an odd frequency.

Therefore, it is also pseudo-palindromic.

---

## Approach

We can solve this problem using **DFS + frequency tracking**.

Since the values are only from `1` to `9`, we can maintain the frequency of each digit while traversing the tree.

For every node:

1. Add the current node's value to the frequency count.
2. Continue DFS into the left and right children.
3. When we reach a leaf node:

    * Check how many digits have an odd frequency.
    * If at most one digit has an odd frequency, the path is pseudo-palindromic.
4. Backtrack by removing the current node's value before returning.

---

## Key Idea

The key observation is:

> A sequence can be rearranged into a palindrome if **at most one value occurs an odd number of times**.

So at every leaf, we only need to check:

```text
number of digits with odd frequency <= 1
```

Because the node values are only `1` to `9`, we only need an array of size `10`.

```text
frequency[1]
frequency[2]
...
frequency[9]
```

---

## Example

Consider:

```text
        2
       / \
      3   1
     / \   \
    3   1   1
```

Consider the path:

```text
2 → 3 → 3
```

Frequencies:

```text
2 → 1
3 → 2
```

Only `2` occurs an odd number of times.

Therefore:

```text
2, 3, 3
```

is pseudo-palindromic.

---

Consider another path:

```text
2 → 3 → 1
```

Frequencies:

```text
1 → 1
2 → 1
3 → 1
```

There are three digits with odd frequencies.

Therefore, this path is **not** pseudo-palindromic.

---

## DFS Logic

The recursive DFS can be thought of as:

```text
dfs(node)
```

At every node:

### Step 1: Add the current digit

```text
frequency[node.val]++
```

### Step 2: Check if it is a leaf

A leaf node has:

```text
node.left == null
node.right == null
```

If it is a leaf, check whether the number of odd frequencies is at most `1`.

### Step 3: Continue DFS

```text
dfs(node.left)
dfs(node.right)
```

### Step 4: Backtrack

After processing the node:

```text
frequency[node.val]--
```

This restores the frequency array for the parent path.

---

## Why Do We Need Backtracking?

Consider:

```text
        2
       / \
      3   1
```

When processing the left subtree:

```text
2 → 3
```

the frequency contains:

```text
2 → 1
3 → 1
```

After finishing the left subtree, we must remove `3`.

Otherwise, when processing the right subtree, the frequency would incorrectly contain the `3` from the left path.

Therefore:

```text
Add before DFS
Remove after DFS
```

This is the standard **backtracking pattern**.

---

## Checking Odd Frequencies

At a leaf, iterate through digits `1` to `9`.

```text
oddCount = 0

for digit = 1 to 9:
    if frequency[digit] % 2 == 1:
        oddCount++
```

The path is pseudo-palindromic if:

```text
oddCount <= 1
```

---

## Optimized Approach Using Bitmask

Because we only care whether a digit has an **odd or even** frequency, we don't actually need to store the exact frequency.

We can use a **bitmask**.

Since there are only `9` possible digits:

```text
1 2 3 4 5 6 7 8 9
```

we can use one bit for each digit.

When a digit appears:

```text
mask ^= (1 << digit)
```

This toggles its bit.

### Why does this work?

If a digit appears:

```text
1 time → bit = 1
2 times → bit = 0
3 times → bit = 1
4 times → bit = 0
```

So:

```text
0 → even frequency
1 → odd frequency
```

At a leaf, we need at most one bit to be set.

---

## Bitmask Condition

A number has at most one bit set if:

```text
mask == 0
```

or:

```text
mask & (mask - 1) == 0
```

Therefore:

```text
if ((mask & (mask - 1)) == 0)
    path is pseudo-palindromic
```

### Why?

For example:

```text
mask = 1000
```

Then:

```text
mask - 1 = 0111
```

So:

```text
1000
&
0111
----
0000
```

Therefore, only one bit was set.

---

## Frequency vs Bitmask

There are two common approaches.

### Approach 1: Frequency Array

```text
frequency[10]
```

Advantages:

* Easy to understand
* Beginner-friendly
* Very straightforward

### Approach 2: Bitmask

```text
mask
```

Advantages:

* Only one integer is required.
* Efficiently tracks odd/even frequency.
* Excellent example of a bit manipulation technique.

For interview purposes, understanding the **frequency approach first** and then optimizing it using a **bitmask** is a good strategy.

---

## Important Observation

We don't care about the exact order of the digits.

For example:

```text
2 → 3 → 3 → 2
```

and:

```text
3 → 2 → 2 → 3
```

have the same frequency counts.

The problem asks whether **some permutation** can form a palindrome.

Therefore, only the frequency of each digit matters.

---

## Leaf Node Condition

We only count paths that go:

```text
Root → Leaf
```

A node is a leaf when:

```text
node.left == null
&&
node.right == null
```

We should check the pseudo-palindromic condition **only at leaf nodes**.

---

## Complexity

Let `N` be the number of nodes in the binary tree.

### Time Complexity

Using the frequency array:

```text
O(N × 9)
```

Since there are only `9` possible digits, this is effectively:

```text
O(N)
```

Using the bitmask approach:

```text
O(N)
```

Each node performs constant-time operations.

### Space Complexity

The DFS recursion uses:

```text
O(H)
```

where `H` is the height of the tree.

* Balanced tree → `O(log N)`
* Skewed tree → `O(N)`

The frequency array/bitmask requires only constant extra space.

---

## DFS + Backtracking Pattern

This problem follows the pattern:

```text
DFS + Backtracking + Path Information
```

The general structure is:

```text
DFS(node, pathInformation)

    Add current node information

    if leaf:
        check condition

    DFS(left)
    DFS(right)

    Remove current node information
```

For this problem:

```text
Path Information = digit frequency / bitmask
```

---

## Important Rules

Remember these points:

1. Only **root-to-leaf** paths are counted.
2. Values are only from `1` to `9`.
3. A sequence can form a palindrome if **at most one value has an odd frequency**.
4. Use DFS to explore every root-to-leaf path.
5. Use backtracking to restore the path state.
6. A bitmask can efficiently track odd/even frequencies.
7. At a leaf:

```text
oddCount <= 1
```

or using bitmask:

```t
```
