# Fixed Size Sliding Window Pattern – Java Example

The **Fixed Size Sliding Window** technique is a powerful pattern used to optimize problems involving contiguous subarrays or substrings of a fixed size `k`.

## ✨ What is the Fixed Size Sliding Window?

A fixed size sliding window is a subarray or substring of length `k` that "slides" over the original data one element at a time. Instead of recalculating values for every subarray from scratch, we adjust the previous result by:
- **Adding** the next element (entering the window)
- **Removing** the first element (leaving the window)

This reduces the time complexity from O(n * k) to O(n).

---

## 🔧 Code Example – Maximum Sum of Subarray of Size K

```java
public int fixedSlidingWindow(int[] arr, int k) {
    int windowSum = 0;
    int maxSum = 0;

    // Step 1: Calculate the sum of the first window
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }
    maxSum = windowSum;

    // Step 2: Slide the window from left to right
    for (int end = k; end < arr.length; end++) {
        windowSum += arr[end] - arr[end - k]; // Add new, remove old
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}
