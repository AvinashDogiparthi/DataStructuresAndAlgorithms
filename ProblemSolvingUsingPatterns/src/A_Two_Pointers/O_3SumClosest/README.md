# Three Sum Closest - Java Solution

## 🔍 Problem Statement

Given an integer array `nums` of length `n` and an integer `target`, find three integers in `nums` such that the sum is closest to `target`. Return the **sum of the three integers**.

You may assume that each input would have exactly one solution.

---

## ✅ Approach

We use the **Two Pointer** technique on a **sorted array** to efficiently check combinations and keep track of the closest sum to the target.

---

## 🚀 Algorithm Steps

1. **Sort the Array**:
    - Sorting helps in applying the two-pointer approach to find optimal triplets.

2. **Initialize**:
    - `closestSum`: Set to the sum of the first three elements.
    - `nearestDistance`: Set to the distance between target and `closestSum`.

3. **Traverse the Array**:
    - Fix the first number using a loop from `i = 0` to `nums.length - 3`.
    - Use two pointers:
        - `left` starts at `i + 1`
        - `right` starts at the end of the array

4. **Evaluate the Sum**:
    - Calculate the `sum = nums[i] + nums[left] + nums[right]`
    - Calculate the `distance = Math.abs(target - sum)`
    - If this distance is smaller than `nearestDistance`, update `closestSum` and `nearestDistance`

5. **Adjust Pointers**:
    - If `sum < target`, move `left` rightward.
    - If `sum > target`, move `right` leftward.
    - If `sum == target`, return `target` immediately (perfect match).

6. **Return the Closest Sum**

---

## 🧠 Java Code

```java
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int nearestDistance = Math.abs(target - closestSum);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int distanceFromTarget = Math.abs(target - sum);

                if (distanceFromTarget < nearestDistance) {
                    nearestDistance = distanceFromTarget;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return target; // exact match
                }
            }
        }

        return closestSum;
    }
}
