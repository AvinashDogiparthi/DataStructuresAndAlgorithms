# Insertion in MinHeap

This document explains **how elements are inserted into a MinHeap using the upHeap method**, with a **step-by-step pictorial explanation**.

We will insert the following elements **in order**: 7, 8, 9, 11, 12, 14, 5



---

## MinHeap Rules

- It is a **Complete Binary Tree**
- **Parent ≤ Children**
- Stored using an **array (0-based indexing)**

### Index Formula
```text
parent(i) = (i - 1) / 2
```

## Step-by-Step Insertions

## Insert 7
```text
Array : [7]

Tree : 
7
```

## Insert 8
```text
Array : [7,8]

8 ≥ 7 → no swap

Tree : 
  7
 /
8
```

## Insert 9
```text
Array : [7,8,9]

9 ≥ 7 → no swap

Tree : 
   7
  / \
 8   9
```

## Insert 11
```text
Array : [7,8,9,11]

11 ≥ 8 → no swap

Tree : 
     7
    / \
   8   9
  /
11
```

## Insert 12
```text
Array : [7,8,9,11,12]

12 ≥ 8 → no swap

Tree : 
     7
    / \
   8   9
  / \
11  12
```

## Insert 14
```text
Array : [7,8,9,11,12,14]

14 ≥ 9 → no swap

Tree : 
       7
      / \
     8   9
    / \  /
  11 12 14
```


## Insert 5
```text
Array : [7,8,9,11,12,14,5]

14 ≥ 9 → no swap

Tree : 
       7
      / \
     8   9
    / \  / \
  11 12 14  5
  
  
  Step 2: Compare with parent (9) : 5 < 9 → swap
          Array: [7, 8, 5, 11, 12, 14, 9]
          Tree:

                   7
                  / \
                 8   5
                / \  / \
              11 12 14  9

    Step 3: Compare again (with 7) : 5 < 7 → swap
            Array: [5, 8, 7, 11, 12, 14, 9]


            Tree:
            
                    5
                  /   \
                 8     7
                / \   / \
              11 12 14  9

     Step 4: Stop : 5 is now the root → stop
            ✔ MinHeap property restored
```

### Final Min Heap 
```text

Array : [5, 8, 7, 11, 12, 14, 9]

Tree Representation  : 
        5
      /   \
     8     7
    / \   / \
  11 12 14  9
```


