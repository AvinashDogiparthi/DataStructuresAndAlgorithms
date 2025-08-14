# 424. Longest Repeating Character Replacement
[Problem Link](https://leetcode.com/problems/longest-repeating-character-replacement/)

## 📝 Problem Statement
You are given a string `s` and an integer `k`.  
You can choose **any character** of the string and change it to any other uppercase English character.  
You can perform this operation **at most `k` times**.

Return the **length of the longest substring** containing the same letter you can get after performing the above operations.

---

### Example 1:
**Input:**
s = "ABAB"
k = 2

**Output:**
**Explanation:** Replace the two `'A'` characters with `'B'` (or vice versa) to get `"BBBB"` (or `"AAAA"`).

---

### Example 2:
**Input:**
s = "AABABBA"
k = 1

**Output:**
**Explanation:** Replace the `'A'` in the middle with `'B'` to form `"AABBBBA"`.  
The substring `"BBBB"` has the longest repeating letters of length 4.  
Other transformations may also achieve the same result.

---