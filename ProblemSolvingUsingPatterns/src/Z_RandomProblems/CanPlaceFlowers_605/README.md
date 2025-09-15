# [605. Can Place Flowers](https://leetcode.com/problems/can-place-flowers/description/?envType=problem-list-v2&envId=array)

## Problem Statement
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers **cannot be planted in adjacent plots**.

Given an integer array `flowerbed` containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return **true** if `n` new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and **false** otherwise.

---

## Examples

### Example 1:
**Input:**  
```text
flowerbed = [1,0,0,0,1], n = 1
```

**Output:**
```text
true
```

### Example 2:
**Input:**
```text
flowerbed = [1,0,0,0,1], n = 2
```

**Output:**
```text
false
```