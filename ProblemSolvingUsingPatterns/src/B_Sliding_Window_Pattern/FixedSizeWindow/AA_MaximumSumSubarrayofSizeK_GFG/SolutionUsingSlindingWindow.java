package B_Sliding_Window_Pattern.FixedSizeWindow.AA_MaximumSumSubarrayofSizeK_GFG;

public class SolutionUsingSlindingWindow {

    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int maximumSum = 0;

        // taking first window size as maximum
        for(int i = 0;i<k;i++){
            maximumSum = maximumSum + arr[i];
        }

        int currentSum = maximumSum;
        for(int i = k;i<arr.length;i++){

            currentSum = currentSum + arr[i] - arr[i-k];
            maximumSum = Math.max(currentSum,maximumSum);
        }

        return maximumSum;
    }
}
