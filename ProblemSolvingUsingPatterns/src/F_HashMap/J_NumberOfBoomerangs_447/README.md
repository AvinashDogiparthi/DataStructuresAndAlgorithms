# 447. Number of Boomerangs

🔗 [Problem Link](https://leetcode.com/problems/number-of-boomerangs/description/)

---

## 📌 Problem Statement
You are given `n` distinct points in the plane, where `points[i] = [xi, yi]`.  
A **boomerang** is a tuple of points `(i, j, k)` such that the **distance between i and j** equals the **distance between i and k**.  
👉 Note: **Order of the tuple matters**.

Return the total number of boomerangs.

---

## ✅ Examples

### Example 1
**Input:**  
points = [[0,0],[1,0],[2,0]]

**Output:**  
2

**Explanation:**  
The two boomerangs are `[[1,0],[0,0],[2,0]]` and `[[1,0],[2,0],[0,0]]`.

---

### Example 2
**Input:**  
points = [[1,1],[2,2],[3,3]]

**Output:**  
2

---

### Example 3
**Input:**  
points = [[1,1]]

**Output:**  
0

---
