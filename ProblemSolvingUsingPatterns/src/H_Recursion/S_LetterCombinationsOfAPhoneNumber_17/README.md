# 17. Letter Combinations of a Phone Number

**LeetCode Problem Link:**  
https://leetcode.com/problems/letter-combinations-of-a-phone-number/

---

##  Problem Statement
Given a string containing digits from `2-9` inclusive, return all possible letter combinations that the number could represent.  
Return the answer in **any order**.

Each digit maps to a set of characters like on a telephone keypad. **Digit `1` does not map to any letters.**

---

##  Mapping Reference
Traditional phone keypad digit-to-letter mapping:

- `2` → `"abc"`
- `3` → `"def"`
- `4` → `"ghi"`
- `5` → `"jkl"`
- `6` → `"mno"`
- `7` → `"pqrs"`
- `8` → `"tuv"`
- `9` → `"wxyz"`

_None_ for `0` and `1`.

---

##  Examples

### Example 1 
**Input:**  
```text
digits = "23"
```

**Output:**
```text
["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

**Explanation:**
```text
**Explanation:**  
- `2` → `"abc"`  
- `3` → `"def"`  
Combine each letter from `"abc"` with each from `"def"`.
```