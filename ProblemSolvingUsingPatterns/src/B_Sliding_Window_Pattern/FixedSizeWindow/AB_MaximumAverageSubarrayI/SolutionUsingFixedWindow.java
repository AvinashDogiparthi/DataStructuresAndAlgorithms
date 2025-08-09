package B_Sliding_Window_Pattern.FixedSizeWindow.AB_MaximumAverageSubarrayI;

public class SolutionUsingFixedWindow {

    public double findMaxAverage(int[] nums, int k) {

        int maximumSum = 0;

        for(int i = 0;i<k;i++){
            maximumSum += nums[i];
        }

        int currentSum = maximumSum;

        for(int i = k;i<nums.length;i++){

            currentSum = currentSum + nums[i] - nums[i-k];
            maximumSum = Math.max(currentSum,maximumSum);
        }

        return (double) maximumSum/k;

    }
}
