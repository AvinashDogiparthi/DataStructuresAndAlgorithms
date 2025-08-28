# 290. Word Pattern

🔗 [LeetCode Problem Link](https://leetcode.com/problems/word-pattern/)

---

## Problem Statement

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here *follow* means a full match, such that there is a **bijection** between a letter in `pattern` and a non-empty word in `s`. Specifically:

- Each letter in `pattern` maps to exactly one unique word in `s`.
- Each unique word in `s` maps to exactly one letter in `pattern`.
- No two letters map to the same word, and no two words map to the same letter.

---

## Examples

### Example 1:
**Input:**
```text
pattern = "abba", s = "dog cat cat dog"
```

**Output:**

```text
true
```

**Explanation:**
```text
The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
```

## Example 2:

**Input:**
```text
pattern = "abba", s = "dog cat cat fish"
```


**Output:**
```text
false
```

## Example 3:

**Input:**
```text
pattern = "aaaa", s = "dog cat cat dog"
```


**Output:**
```text
false
```
