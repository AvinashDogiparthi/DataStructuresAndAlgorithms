# Relative Ranks 🏅

**Difficulty:** Easy  
**Problem ID:** 506  
**Platform:** LeetCode

🔗 **Problem Link:**  
https://leetcode.com/problems/relative-ranks/

---

##  Problem Description

You are given an integer array `score` of size `n`, where `score[i]` represents the score of the *i-th* athlete in a competition.  
All scores are **unique**.

Athletes are ranked based on their scores:
- **Highest score** → 1st place
- **Second highest score** → 2nd place
- And so on…

### Ranking Rules
- 1st place → `"Gold Medal"`
- 2nd place → `"Silver Medal"`
- 3rd place → `"Bronze Medal"`
- 4th place and beyond → their numeric rank as a string (e.g., `"4"`, `"5"`)

---

## Input

- An integer array `score`
- `1 <= score.length <= 10^4`
- `0 <= score[i] <= 10^6`
- All values in `score` are **unique**

---