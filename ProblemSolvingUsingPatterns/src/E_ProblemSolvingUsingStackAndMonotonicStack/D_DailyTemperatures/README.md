# 739. Daily Temperatures

[LeetCode Problem Link](https://leetcode.com/problems/daily-temperatures/)

## 📘 Problem
You are given an array of integers `temperatures` where `temperatures[i]` represents the temperature on the `i-th` day.

Return an array `answer` such that:
- `answer[i]` = the number of days you must wait after the `i-th` day to get a **warmer temperature**.
- If there is no future day with a warmer temperature, then `answer[i] = 0`.

---

## 🔹 Examples

### Example 1
**Input**  
temperatures = [73,74,75,71,69,72,76,73]


**Output**  
[1,1,4,2,1,1,0,0]


---

### Example 2
**Input**  
temperatures = [30,40,50,60]


**Output**  
[1,1,1,0]


---

### Example 3
**Input**  
temperatures = [30,60,90]


**Output**  
[1,1,0]


---

## 🔒 Constraints
- `1 <= temperatures.length <= 10^5`
- `30 <= temperatures[i] <= 100`

---