# ✂️ 1957. Delete Characters to Make Fancy String

[LeetCode Problem Link](https://leetcode.com/problems/delete-characters-to-make-fancy-string/)

---

## 📘 Problem Statement

A **fancy string** is a string where **no three consecutive characters** are equal.

Given a string `s`, delete the **minimum possible number of characters** from `s` to make it fancy.

Return the **final string** after the deletion.  
It can be shown that the answer will always be unique.

---

## ✅ Examples

### Example 1
**Input:**
```text
s = "leeetcode"
```
**Output:**
```text
"leetcode"
```

**Explanation:**
```text
Remove one 'e' from the group of 'e's → "leetcode".

Now no three consecutive characters are equal.
```

### Example 2
**Input:**
```text
s = "aaabaaaa"
```
**Output:**
```text
"aabaa"
```

**Explanation:**
```text
Remove one 'a' → "aabaaaa"

Remove two 'a's → "aabaa"

Final string is fancy.
```

### Example 3
**Input:**
```text
s = "aab"
```
**Output:**
```text
"aab"
```

**Explanation:**
```text
Already fancy → return "aab".
```