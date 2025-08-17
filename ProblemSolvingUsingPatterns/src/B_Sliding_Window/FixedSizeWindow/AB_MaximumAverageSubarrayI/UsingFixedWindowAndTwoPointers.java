package B_Sliding_Window.FixedSizeWindow.AB_MaximumAverageSubarrayI;

public class UsingFixedWindowAndTwoPointers {

    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int p1 = 0;
            int p2 = k;
            int maxSum = 0;

            for (int i = 0; i < k; i++) {
                maxSum += nums[i];
            }

            int currentSum = maxSum;
            while (p2 < nums.length) {
                currentSum += nums[p2++] - nums[p1++];
                maxSum = Math.max(maxSum, currentSum);
            }

            return (double) maxSum / k;
        }
    }

}
