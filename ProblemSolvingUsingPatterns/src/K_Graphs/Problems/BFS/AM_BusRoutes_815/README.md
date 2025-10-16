# [815. Bus Routes](https://leetcode.com/problems/bus-routes/)

## Problem Description
You are given an array `routes` representing bus routes, where `routes[i]` is a **bus route** that the *i-th bus* repeats **forever**.

For example, if `routes[0] = [1, 5, 7]`, it means the 0th bus travels as:  
`1 → 5 → 7 → 1 → 5 → 7 → ...` infinitely.

You start at a **bus stop** called `source` (you are not on any bus initially), and you want to reach another stop called `target`.  
You can travel only via **buses**, moving between stops included in their routes.

Return the **minimum number of buses** you need to take to go from `source` to `target`.  
If it’s **impossible**, return `-1`.

---

### Example 1
**Input:**
```text
routes = [[1,2,7],[3,6,7]], source = 1, target = 6
```
**Output:**
```text
2
```

**Explanation:**
```text
Take the first bus from stop 1 to stop 7, then the second bus from stop 7 to stop 6.
```

### Example 2
**Input:**
```text
routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
```

**Output:**
```text
-1
```
**Explanation:**
```text
No possible path from stop 15 to 12 using the available routes.
```


---

### Constraints
```text
1 <= routes.length <= 500
1 <= routes[i].length <= 10^5
All values in routes[i] are unique
sum(routes[i].length) <= 10^5
0 <= routes[i][j] < 10^6
0 <= source, target < 10^6
```