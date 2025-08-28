# 🔡 290. Word Pattern

[LeetCode Problem Link](https://leetcode.com/problems/word-pattern/description/)

---

## 📘 Problem Statement

Given a `pattern` and a string `s`, determine if `s` follows the same pattern.

Here **follow** means there is a **bijection** between a letter in `pattern` and a non-empty word in `s`. Specifically:

- Each letter in `pattern` maps to exactly **one unique word** in `s`.
- Each unique word in `s` maps to exactly **one letter** in `pattern`.
- No two letters map to the same word.
- No two words map to the same letter.

---

## ✅ Examples

### Example 1
**Input:**
```text
pattern = "abba"
s = "dog cat cat dog"
```
**Output:**
```text
true
```

**Explanation:**
```text
'a' → "dog"

'b' → "cat"

The mapping is consistent.
```

### Example 2
**Input:**
```text
pattern = "abba"
s = "dog cat cat fish"
```
**Output:**
```text
false
```

### Example 3
**Input:**
```text
pattern = "aaaa"
s = "dog cat cat dog"
```
**Output:**
```text
false
```

