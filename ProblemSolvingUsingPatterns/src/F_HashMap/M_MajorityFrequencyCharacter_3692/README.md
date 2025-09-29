# 3692. Majority Frequency Characters

## Problem Link
[LeetCode - Majority Frequency Characters](https://leetcode.com/problems/majority-frequency-characters/)

---

## Problem Statement
You are given a string `s` consisting of lowercase English letters.

- The **frequency group** for a value `k` is the set of characters that appear exactly `k` times in `s`.
- The **majority frequency group** is the frequency group that contains the **largest number of distinct characters**.
- If two or more frequency groups tie for the largest size, choose the group whose frequency `k` is larger.

Return a string containing all characters in the majority frequency group, in any order.

---

## Examples

### Example 1:
**Input**  
s = "aaabbbccdddde"


**Output**  
"ab"

**Explanation**

| Frequency (k) | Distinct Characters in Group | Group Size | Majority? |
|---------------|-------------------------------|------------|-----------|
| 4             | {d}                           | 1          | No        |
| 3             | {a, b}                        | 2          | Yes       |
| 2             | {c}                           | 1          | No        |
| 1             | {e}                           | 1          | No        |

Majority frequency group → characters `a` and `b`. Both `"ab"` and `"ba"` are valid answers.

---

### Example 2:
**Input**  
s = "abcd"


**Output**  
"abcd"


**Explanation**

| Frequency (k) | Distinct Characters in Group | Group Size | Majority? |
|---------------|-------------------------------|------------|-----------|
| 1             | {a, b, c, d}                 | 4          | Yes       |

All characters appear once, so the majority group contains all of them.

---

### Example 3:
**Input**  
s = "pfpfgi"


**Output**  
"fp"


**Explanation**

| Frequency (k) | Distinct Characters in Group | Group Size | Majority? |
|---------------|-------------------------------|------------|-----------|
| 2             | {p, f}                        | 2          | Yes       |
| 1             | {g, i}                        | 2          | No (lower frequency) |

Both `'p'` and `'f'` share the same frequency `2`. Tie-breaking rule picks the higher frequency.

---