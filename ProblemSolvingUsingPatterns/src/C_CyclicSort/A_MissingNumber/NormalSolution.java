package C_CyclicSort.A_MissingNumber;

public class NormalSolution {

    public int missingNumber(int[] nums) {
        int rangeSum = 0;

        for(int i = 0;i<=nums.length;i++){
            rangeSum = rangeSum + i;
        }

        int numsSum = 0;

        for(int i = 0;i<nums.length;i++){
            numsSum = numsSum + nums[i];
        }

        return rangeSum - numsSum;
    }
}
