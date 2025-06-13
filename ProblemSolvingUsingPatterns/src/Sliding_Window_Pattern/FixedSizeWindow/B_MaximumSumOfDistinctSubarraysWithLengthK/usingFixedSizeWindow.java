package Sliding_Window_Pattern.FixedSizeWindow.B_MaximumSumOfDistinctSubarraysWithLengthK;

import java.util.HashSet;
import java.util.Set;

public class usingFixedSizeWindow {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (unique.contains(nums[right])) {
                windowSum -= nums[left];
                unique.remove(nums[left]);
                left++;
            }

            unique.add(nums[right]);
            windowSum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= nums[left];
                unique.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
    }
}
