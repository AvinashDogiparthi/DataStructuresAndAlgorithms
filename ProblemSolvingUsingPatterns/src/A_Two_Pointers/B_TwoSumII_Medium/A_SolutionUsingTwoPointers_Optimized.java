package A_Two_Pointers.B_TwoSumII_Medium;

public class A_SolutionUsingTwoPointers_Optimized {

    public int[] twoSum(int[] numbers, int target) {

        boolean found = false;
        int[] returnableArray = new int[2];
        int sum = 0;

        int pointerA = 0;
        int pointerB = numbers.length-1;

        while(pointerA < pointerB){

            sum = numbers[pointerA] + numbers[pointerB];
            // base condition
            if(sum == target){
                returnableArray[0] = pointerA+1;
                returnableArray[1] = pointerB+1;
                found = true;
            }

            // shifting pointers
            if(sum < target){
                pointerA++;
            } else {
                pointerB--;
            }
        }

        return found?returnableArray:new int[]{-1,-1};
    }
}
