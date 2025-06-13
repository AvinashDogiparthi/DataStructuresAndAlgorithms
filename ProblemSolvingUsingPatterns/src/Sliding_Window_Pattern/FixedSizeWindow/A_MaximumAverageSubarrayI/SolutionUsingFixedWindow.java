package Sliding_Window_Pattern.FixedSizeWindow.A_MaximumAverageSubarrayI;

public class SolutionUsingFixedWindow {

    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;
        double sum = 0;

        for(int i = 0;i<k;i++){
            sum = sum + nums[i];
        }

        maxAverage = sum/k; //initial k indices sum

        for(int i = k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            double currentSumAverage = sum/k;
            maxAverage = Math.max(maxAverage,currentSumAverage);
        }

        return maxAverage;
    }
}
