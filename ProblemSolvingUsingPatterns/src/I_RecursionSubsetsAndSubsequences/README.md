# Recursion for Subsequences

This folder explains how to generate all subsequences of a given string using recursion.
A subsequence is a sequence that can be derived from another sequence by deleting some (or none) of the characters, without changing the order of the remaining characters.

👉 Example:
For "abc", the subsequences are:
["abc", "ab", "ac", "a", "bc", "b", "c"]

---

## Recursion Tree (for `"abc"`)

The figure below visualizes how the recursion branches for each character (include ↙ / exclude ↘), and how we collect only **non-empty** subsequences at the leaves.

![Recursion Tree](https://github.com/AvinashDogiparthi/DataStructuresAndAlgorithms/blob/main/ProblemSolvingUsingPatterns/src/I_RecursionSubsetsAndSubsequences/recursionTree.PNG)

Result (ignoring empty):  
`["abc", "ab", "ac", "a", "bc", "b", "c"]`

---

## 🧩 Key Idea (p / up)

- `p` (**processed**): the subsequence we’ve built so far
- `up` (**unprocessed**): the part of the string we still need to decide on

At each step:
- Take `ch = up.charAt(0)`
- Recurse **including** `ch`: `subsequence(p + ch, up.substring(1))`
- Recurse **excluding** `ch`: `subsequence(p,     up.substring(1))`

**Base case:** when `up` becomes empty, we’ve made all choices.
- If `p` is **non-empty**, collect/print it.
- Otherwise, ignore (we don’t want the empty subsequence).

---

## ✅ Template 1 — Print Only

```java
package I_RecursionSubsetsAndSubsequences;

public class TemplateSolutionPrint {

    public static void main(String[] args) {
        getSubSequences("", "abc"); // prints: abc, ab, ac, a, bc, b, c
    }

    public static void getSubSequences(String p, String up) {
        if (up.isEmpty()) {
            // ignoring empty subsequence
            if (!p.isEmpty()) {
                System.out.println(p);
            }
            return;
        }

        char ch = up.charAt(0);

        // include current character
        getSubSequences(p + ch, up.substring(1));

        // exclude current character
        getSubSequences(p, up.substring(1));
    }
}
```

---

## ✅ Template 2 — Return All Subsequences as a List

```java
package I_RecursionSubsetsAndSubsequences;

import java.util.ArrayList;
import java.util.List;

public class TemplateSolutionReturn {

    public static void main(String[] args) {
        List<String> result = getSubSequences("", "abc");
        System.out.println(result); // [abc, ab, ac, a, bc, b, c]
    }

    public static List<String> getSubSequences(String p, String up) {
        List<String> result = new ArrayList<>();

        if (up.isEmpty()) {
            if (!p.isEmpty()) {
                result.add(p); // collect only non-empty
            }
            return result;
        }

        char ch = up.charAt(0);

        // include current character
        result.addAll(getSubSequences(p + ch, up.substring(1)));

        // exclude current character
        result.addAll(getSubSequences(p, up.substring(1)));

        return result;
    }
}
```
---

## Complexity
Count of subsequences: 2^n - 1(excluding empty)

**Time Complexity:O(2^n * n)**
```text
2^n branches; up to O(n) to build/collect each string
```

**Space Complexity:O(n)**
```text
Recursion stack: O(n)
```
---

## Resources

- [Recursion — Subsequences & Subsets (YouTube)](https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=7)


