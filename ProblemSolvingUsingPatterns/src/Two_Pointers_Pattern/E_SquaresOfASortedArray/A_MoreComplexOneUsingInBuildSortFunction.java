package Two_Pointers_Pattern.E_SquaresOfASortedArray;

import java.util.Arrays;

public class A_MoreComplexOneUsingInBuildSortFunction {

    public int[] sortedSquares(int[] nums) {

        for(int i = 0;i<nums.length;i++){
            int tempVar = nums[i];
            nums[i] = (int) Math.pow(tempVar,2);
        }

        Arrays.sort(nums);
        return nums;

    }
}
