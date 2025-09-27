# 812. Largest Triangle Area

🔗 [Problem Link](https://leetcode.com/problems/largest-triangle-area/?envType=daily-question&envId=2025-09-27)

## 📘 Problem Statement
You are given an array of points on the **X-Y plane** where `points[i] = [xi, yi]`.  
Your task is to **return the area of the largest triangle** that can be formed by any three different points.

Answers within `1e-5` of the actual answer will be accepted.

---

### Example 1:
**Input:**
points = [[0,0],[0,1],[1,0],[0,2],[2,0]]

**Output:**
2.00000

**Explanation:**  
The five points are shown in the figure. The red triangle is the largest.

---

### Example 2:
**Input:**
points = [[1,0],[0,0],[0,1]]

**Output:**
0.50000


---

## 🔒 Constraints
- `3 <= points.length <= 50`
- `-50 <= xi, yi <= 50`
- All the given points are **unique**

---