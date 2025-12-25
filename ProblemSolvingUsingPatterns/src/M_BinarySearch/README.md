# Binary Search

**Binary Search** is an efficient algorithm used to find the **position of a target element** in a **sorted array**. Unlike linear search, which checks each element one by one, binary search **divides the search space in half** with each step, making it much faster.

---

## How Binary Search Works

1. Start with the entire sorted array.
2. Find the **middle element** of the array.
3. Compare the **middle element** with the target:
    - If it matches the target, return the index.
    - If the target is **smaller** than the middle element, search in the **left half**.
    - If the target is **larger**, search in the **right half**.
4. Repeat steps 2-3 on the new subarray until the target is found or the subarray is empty.

> **Important:** The array **must be sorted** for binary search to work correctly.

---

## Complexity

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1) for iterative, O(log n) for recursive

---

## Example (Iterative in Java)

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }
}
```
```text
Output : Element found at index : 3
```

## Example (Recursive in Java)

```java
public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        } else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
    }
}
```

```text
Output : Element found at index : 4
```

## Summary
* Binary search works only on sorted arrays. 
* It reduces the search space by half in each step. 
* Much faster than linear search for large datasets.
