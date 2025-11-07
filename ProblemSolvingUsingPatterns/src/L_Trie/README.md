# Trie Data Structure (Prefix Tree)

A **Trie (Prefix Tree)** is a special type of tree data structure used to efficiently store and retrieve strings, typically words in a dictionary. It is particularly useful for **autocomplete systems**, **spell checkers**, and **prefix-based searching**.

---

## What is a Trie?

A **Trie** is a tree-like data structure that stores a dynamic set of strings, usually over an alphabet.

Each node in a Trie:
- Represents a single character of a string.
- Has up to *n* children (where *n* is the alphabet size, typically 26 for lowercase English letters).
- Has a boolean flag `isEndOfWord` to mark the end of a valid word.

### Example:
Storing the words `"and"` and `"ant"` in a Trie:
```text
(root)
|
a
|
n
/ \
d   t
```
Here:
- `"and"` ends at node `d`
- `"ant"` ends at node `t`

---

## Trie Node Structure

```java
public class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // for a-z
        isEndOfWord = false;
    }
}

```
Explanation:
children[26] → Array representing possible next letters.
isEndOfWord → True if a word ends at this node.

### Insertion in Trie

Algorithm Steps:
```text
Start from the root node.

For each character c in the word:

Compute index idx = c - 'a'.

If children[idx] is null, create a new TrieNode.

Move to that child node.

After all characters are processed, mark the last node as isEndOfWord = true.
```


Code Example:
```java
static void insert(TrieNode root, String key) {
    TrieNode curr = root;
    for (char c : key.toCharArray()) {
        if (curr.children[c - 'a'] == null)
            curr.children[c - 'a'] = new TrieNode();
        curr = curr.children[c - 'a'];
    }
    curr.isEndOfWord = true;
}

```

### Time & Space Complexity
Operation	Complexity	Description
Time	O(n)	n = length of key
Space	O(n)	For creating new nodes


### Searching in Trie
Algorithm Steps:

```text
Start from root.

For each character c in the key:

Compute idx = c - 'a'.

If children[idx] is null → word not found.

Move to children[idx].

After processing all characters, check if isEndOfWord == true.
```

Code Example:
```java
static boolean search(TrieNode root, String key) {
    TrieNode curr = root;
    for (char c : key.toCharArray()) {
        if (curr.children[c - 'a'] == null)
            return false;
        curr = curr.children[c - 'a'];
    }
    return curr.isEndOfWord;
}
```

### Time & Space Complexity
Operation	Complexity
Time	O(n)
Space	O(1)

### Prefix Searching (Starts With)
Concept
Prefix search determines whether a given prefix exists in the Trie — not necessarily a complete word.

Code Example:
```java
boolean isPrefix(TrieNode root, String prefix) {
    TrieNode curr = root;
    for (char c : prefix.toCharArray()) {
        int index = c - 'a';
        if (curr.children[index] == null)
            return false;
        curr = curr.children[index];
    }
    return true;
}
```

Complexity
Operation	Time	Space
Prefix Search	O(n)	O(1)

### Full Trie Implementation
```java
class TrieNode {
    TrieNode[] children;
    boolean isLeaf;

    TrieNode() {
        children = new TrieNode[26];
        isLeaf = false;
    }
}

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word
    public void insert(String key) {
        TrieNode curr = root;
        for (char c : key.toCharArray()) {
            if (curr.children[c - 'a'] == null)
                curr.children[c - 'a'] = new TrieNode();
            curr = curr.children[c - 'a'];
        }
        curr.isLeaf = true;
    }

    // Search for a word
    public boolean search(String key) {
        TrieNode curr = root;
        for (char c : key.toCharArray()) {
            if (curr.children[c - 'a'] == null)
                return false;
            curr = curr.children[c - 'a'];
        }
        return curr.isLeaf;
    }

    // Check if prefix exists
    public boolean isPrefix(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            if (curr.children[c - 'a'] == null)
                return false;
            curr = curr.children[c - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] words = {"and", "ant", "do", "dad"};
        for (String word : words)
            trie.insert(word);

        String[] searchWords = {"do", "gee", "bat"};
        for (String word : searchWords)
            System.out.print(trie.search(word) + " ");
        System.out.println();

        String[] prefixes = {"ge", "ba", "do", "de"};
        for (String prefix : prefixes)
            System.out.print(trie.isPrefix(prefix) + " ");
    }
}
```

Output
arduino
true false false
false false true false

### Complexity Summary
```text
Operation	Time Complexity	Space Complexity	Notes
Insert	O(n)	O(n)	n = word length
Search	O(n)	O(1)	Linear in length
Prefix Search	O(n)	O(1)	Stops early if prefix ends
```

### Use Cases
* Autocomplete systems (e.g., Google search suggestions)
* Spell checkers
* IP routing (Longest Prefix Matching)
* Dictionary / Word lookup
* Search engines for prefix-based queries

### Advantages
✅ Fast prefix-based search
✅ Efficient for large word sets
✅ Deterministic lookup time (O(n))

### Disadvantages
❌ High memory usage (especially for sparse data)
❌ Inefficient for storing very long strings with similar prefixes

### References
🔗 **GeeksforGeeks:** https://www.geeksforgeeks.org/dsa/trie-insert-and-search/


