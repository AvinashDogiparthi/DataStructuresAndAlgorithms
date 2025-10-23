# [3461. Check If Digits Are Equal in String After Operations I](https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/?envType=daily-question&envId=2025-10-23)

## 🧩 Problem Description

You are given a string `s` consisting of digits.  
Perform the following operation repeatedly **until the string has exactly two digits**:

1. For each pair of **consecutive digits** in `s`, starting from the first digit,  
   calculate a new digit as the **sum of the two digits modulo 10**.
2. Replace `s` with the sequence of newly calculated digits, maintaining the order in which they are computed.

Return **`true`** if the final two digits in `s` are the same, otherwise **`false`**.

---

## 🧠 Example 1

**Input:** 
```text
s = "3902"
```

**Process:**
```text
Initial: "3902"
Step 1: (3+9)%10=2, (9+0)%10=9, (0+2)%10=2 → "292"
Step 2: (2+9)%10=1, (9+2)%10=1 → "11"
```

**Output:**  
```text
true
```


**Explanation:**  
```text
The final string `"11"` has both digits equal.
```
---

## 🧠 Example 2

**Input:**  
```text
s = "34789"
```
**Process:**
```text
Initial: "34789"
Step 1: (3+4)%10=7, (4+7)%10=1, (7+8)%10=5, (8+9)%10=7 → "7157"
Step 2: (7+1)%10=8, (1+5)%10=6, (5+7)%10=2 → "862"
Step 3: (8+6)%10=4, (6+2)%10=8 → "48"
```


**Output:**  
```text
false
```

**Explanation:**  
```text
The final string `"48"` has different digits.
```
---

## ⚙️ Constraints

- `3 <= s.length <= 100`
- `s` consists only of digits `'0'–'9'`.

---