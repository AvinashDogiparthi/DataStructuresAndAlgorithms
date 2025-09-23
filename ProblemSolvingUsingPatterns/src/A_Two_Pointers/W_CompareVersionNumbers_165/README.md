# 165. Compare Version Numbers

🔗 [LeetCode Problem Link](https://leetcode.com/problems/compare-version-numbers/?envType=daily-question&envId=2025-09-23)

---

## Problem Statement

Given two version strings, **version1** and **version2**, compare them.

- A version string consists of revisions separated by dots `.`.
- Each revision is an integer, ignoring leading zeros.
- Missing revisions are treated as `0`.

Return:
- `-1` if `version1 < version2`
- `1` if `version1 > version2`
- `0` if both are equal

---

## Examples

### Example 1
**Input:**  
version1 = "1.2", version2 = "1.10"

**Output:**  
-1

**Explanation:**  
Second revision `2 < 10`.

---

### Example 2
**Input:**  
version1 = "1.01", version2 = "1.001"

**Output:**  
0

**Explanation:**  
Both `"01"` and `"001"` represent integer `1`.

---

### Example 3
**Input:**  
version1 = "1.0", version2 = "1.0.0.0"

**Output:**  
0

**Explanation:**  
Missing revisions are treated as `0`.

---

## Constraints
- `1 <= version1.length, version2.length <= 500`
- Only digits and `.` appear in the strings
- Valid version numbers
- Revisions fit in a **32-bit integer**

---