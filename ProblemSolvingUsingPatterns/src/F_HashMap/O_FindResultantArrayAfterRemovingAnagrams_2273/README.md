# [2273. Find Resultant Array After Removing Anagrams](https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/?envType=daily-question&envId=2025-10-13)

## Problem Description

You are given a 0-indexed string array `words`, where `words[i]` consists of lowercase English letters.

In one operation, select any index `i` such that `0 < i < words.length` and `words[i - 1]` and `words[i]` are anagrams, and delete `words[i]` from `words`. Keep performing this operation as long as you can select an index that satisfies the conditions.

Return `words` after performing all operations. It can be shown that selecting the indices for each operation in any arbitrary order will lead to the same result.

**An Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase using all the original letters exactly once. For example, `"dacb"` is an anagram of `"abdc"`.

---

## Examples

### Example 1:
Input: words = ["abba","baba","bbaa","cd","cd"]
Output: ["abba","cd"]

**Explanation:**
- `words[2] = "bbaa"` and `words[1] = "baba"` are anagrams, delete `words[2]` → `["abba","baba","cd","cd"]`
- `words[1] = "baba"` and `words[0] = "abba"` are anagrams, delete `words[1]` → `["abba","cd","cd"]`
- `words[2] = "cd"` and `words[1] = "cd"` are anagrams, delete `words[2]` → `["abba","cd"]`
- Final array: `["abba","cd"]`

### Example 2:
Input: words = ["a","b","c","d","e"]
Output: ["a","b","c","d","e"]

**Explanation:** No two adjacent strings are anagrams, so no operations are performed.

---

## Constraints

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 10`
- `words[i]` consists of lowercase English letters

---