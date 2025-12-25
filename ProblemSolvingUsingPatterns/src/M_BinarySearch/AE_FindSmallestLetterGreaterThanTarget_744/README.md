# 744. Find Smallest Letter Greater Than Target

**Difficulty:** Easy  
**Status:** Solved

---

## 📌 Problem Statement

You are given an array of characters **`letters`** that is sorted in **non-decreasing order**, and a character **`target`**.  
There are at least **two different characters** in `letters`.

Return the **smallest character** in `letters` that is **lexicographically greater than `target`**.

👉 If such a character **does not exist**, return the **first character** in `letters` (wrap-around case).

---

## 🔗 Problem Link

- LeetCode:  
  https://leetcode.com/problems/find-smallest-letter-greater-than-target/

---

## 🧪 Examples

### Example 1
**Input:**
letters = ["c","f","j"]
target = "a"

**Output:**
"c"

**Explanation:**  
The smallest character lexicographically greater than `'a'` is `'c'`.

---

### Example 2
**Input:**
letters = ["c","f","j"]
target = "c"

**Output:**
"f"

**Explanation:**  
The smallest character lexicographically greater than `'c'` is `'f'`.

---

### Example 3
**Input:**
letters = ["c","f","j"]
target = "j"

**Output:**
"c"

**Explanation:**  
No character is greater than `'j'`, so the result wraps around to the first character `'c'`.

---