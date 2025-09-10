# 205. Isomorphic Strings

## Problem Statement
Given two strings `s` and `t`, determine if they are **isomorphic**.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`.
- All occurrences of a character must be replaced with **the same character**.
- The order of characters must be preserved.
- No two different characters may map to the same character, but a character may map to itself.

🔗 [Problem Link](https://leetcode.com/problems/isomorphic-strings/)

---

### Examples

## Example 1 

**Input:**
```text
s = "egg", t = "add"
```

**Output:**
```text
true
```

**Explanation:**
```text
'e' → 'a', 'g' → 'd'
```

## Example 2

**Input:**
```text
s = "foo", t = "bar"
```

**Output:**
```text
false
```

**Explanation:**
```text
'o' cannot map to both 'a' and 'r'
```

## Example 3

**Input:**
```text
s = "paper", t = "title"
```

**Output:**
```text
true
```

**Explanation:**
```text
'p' → 't', 'a' → 'i', 'e' → 'l', 'r' → 'e'
```
