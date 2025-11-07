# 208. Implement Trie (Prefix Tree)

🔗 **Problem Link:** [LeetCode 208 — Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/description/?envType=problem-list-v2&envId=trie)

---

## Problem Description

A **Trie** (pronounced as *"try"*) or **Prefix Tree** is a tree data structure used to efficiently store and retrieve keys in a dataset of strings.

It is widely used for:
- Autocomplete features
- Spell checkers
- Prefix-based search systems

---

### You need to implement the following methods:

| Method | Description |
|--------|--------------|
| **`Trie()`** | Initializes the Trie object. |
| **`void insert(String word)`** | Inserts the string `word` into the Trie. |
| **`boolean search(String word)`** | Returns `true` if the string `word` exists in the Trie, otherwise `false`. |
| **`boolean startsWith(String prefix)`** | Returns `true` if there is any word previously inserted that starts with `prefix`. |

---

### Example

#### **Input:**
```text
["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
