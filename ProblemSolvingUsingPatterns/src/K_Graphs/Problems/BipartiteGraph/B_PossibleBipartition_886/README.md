# [886. Possible Bipartition](https://leetcode.com/problems/possible-bipartition/)

## Problem Description
We want to split a group of `n` people (labeled from 1 to n) into two groups of any size.  
Each person may dislike some other people, and they should **not** go into the same group.

Given:
- An integer `n`
- An array `dislikes` where `dislikes[i] = [ai, bi]` means person `ai` does not like person `bi`

Return:
- `true` if it’s possible to split everyone into **two groups** so that no pair of people who dislike each other end up in the same group.
- Otherwise, return `false`.

---

## Example 1
**Input:**
```text
n = 4, dislikes = [[1,2],[1,3],[2,4]]
```

**Output:**
```text
true
```

**Explanation:**
```text
The first group has [1,4], and the second group has [2,3].
```

## Example 2
**Input:**
```text
n = 3, dislikes = [[1,2],[1,3],[2,3]]
```

**Output:**
```text
false
```

**Explanation:**
```text
We need at least 3 groups to divide them.
```

---

## Constraints
- `1 <= n <= 2000`
- `0 <= dislikes.length <= 10⁴`
- `dislikes[i].length == 2`
- `1 <= ai < bi <= n`
- All dislike pairs are unique

---