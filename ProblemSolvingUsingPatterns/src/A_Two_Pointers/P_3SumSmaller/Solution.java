package A_Two_Pointers.P_3SumSmaller;

import java.util.Arrays;

public class Solution {
    /**
     * @param nums:  an array of n integers
     * @param target: a target
     * @return: the number of index triplets satisfy the condition nums[i] + nums[j] + nums[k] < target
     */
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < target) {
                    // All combinations from left to right are valid
                    count += (right-left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
