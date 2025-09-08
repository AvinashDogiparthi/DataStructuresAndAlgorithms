# 1317. Convert Integer to the Sum of Two No-Zero Integers

**Problem Link:** [LeetCode - Convert Integer to the Sum of Two No-Zero Integers](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/)

---

## Problem Description

We are given an integer `n` and need to split it into **two positive integers** `a` and `b` such that:

1. **a and b are No-Zero integers**
    - A **No-Zero integer** means that when written in decimal form, it does **not** contain the digit `0`.
    - Example: `101` is **not allowed**, `23` is allowed.

2. **a + b = n**
    - The sum of the two chosen numbers should exactly equal `n`.

3. **At least one valid solution always exists**
    - The test cases are designed in such a way that for every `n`, there will always be a valid pair `[a, b]`.
    - If multiple valid answers exist, **any one of them is acceptable**.

---

## Examples

### Example 1:
**Input:**
```text
n = 2
```

**Output:**
```text
[1,1]
```

**Explanation:**
```text
- `1` is a No-Zero integer.  
- `1` is a No-Zero integer.  
- Their sum is `1 + 1 = 2`.  
- Both conditions are satisfied.
```

### Example 2:
**Input:**
```text
n = 11
```

**Output:**
```text
[2,9]
```

**Explanation:**
```text
- `2` is a No-Zero integer.  
- `9` is a No-Zero integer.  
- Their sum is `2 + 9 = 11`.  
- ✅ This is valid.  
- Other valid answers are possible, for example `[8,3]`.  
```

---

## Constraints
- `2 <= n <= 10^4`
- At least one valid solution exists for every `n`.

---