# Sliding Window Pattern in Problem Solving

The **Sliding Window Pattern** is a powerful technique used to optimize problems that involve **arrays** or **strings** where we need to examine a *contiguous sequence* of elements (a subarray or substring).  
Instead of recomputing results repeatedly for overlapping subproblems, we maintain a "window" that slides over the input, updating the result efficiently.

---

## 🔑 Why Sliding Window?
- Reduces **O(n²)** brute-force solutions into **O(n)** or **O(n log n)**.
- Ideal for problems involving:
    - Subarrays with given sum/size
    - Substrings with certain constraints
    - Finding minimum/maximum in a range
    - Counting/analyzing frequencies

---

## 📌 Types of Sliding Window
### 1. Fixed Size Window
- The window size is **constant** (e.g., subarray of size `k`).
- As the window slides, add the new element and remove the old one.
- Example: "Maximum sum subarray of size K".

👉 Implemented in:  
[`FixedSizeWindow`](./FixedSizeWindow)

---

### 2. Dynamic Size Window
- The window **expands or shrinks** based on conditions (frequency, distinct chars, target sum, etc.).
- Common in string problems: "smallest substring containing all characters", "longest substring without repeating characters".
- Requires careful use of **two pointers** (`left` and `right`) to manage the window.

👉 Implemented in:  
[`DynamicSizeWindow`](./DynamicSizeWindow)

---

### 3. Substring Template Solutions
All problems inside `SubStringTemplateProblemsUsingSlidingWindow` are based on this template:

```java
public static List<Integer> slidingWindowTemplate(String s, String t) {
    List<Integer> result = new LinkedList<>();
    if (t.length() > s.length()) return result;

    // Store frequency of chars in target string
    Map<Character, Integer> map = new HashMap<>();
    for (char c : t.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int counter = map.size(); // number of unique chars to match
    int begin = 0, end = 0;

    while (end < s.length()) {
        char c = s.charAt(end);
        if (map.containsKey(c)) {
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) counter--;
        }
        end++;

        while (counter == 0) {
            char tempc = s.charAt(begin);
            if (map.containsKey(tempc)) {
                if (map.get(tempc) == 0) counter++;
                map.put(tempc, map.get(tempc) + 1);
            }

            // update/save result here depending on the problem
            begin++;
        }
    }
    return result;
}

---
