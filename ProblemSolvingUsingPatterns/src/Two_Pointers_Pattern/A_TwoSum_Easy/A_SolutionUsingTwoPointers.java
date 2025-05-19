package Two_Pointers_Pattern.A_TwoSum_Easy;

import java.util.Arrays;

public class A_SolutionUsingTwoPointers {

    public int[] twoSum(int[] nums, int target) {
        int[] copiedArray = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);

        int pointerA = 0;
        int pointerB = nums.length-1;

        int sum = 0;
        boolean found = false;
        int[] returnableArray = new int[2];

        // Time Complexity : O(N)
        while(pointerA < pointerB){

            sum = nums[pointerA]+nums[pointerB];

            // base condition
            if( sum == target){

                int pointerAValueIndex = searchElement(nums[pointerA],copiedArray,-1);
                int pointerBValueIndex = searchElement(nums[pointerB], copiedArray,pointerAValueIndex);

                returnableArray[0] = pointerAValueIndex;
                returnableArray[1] = pointerBValueIndex;
                found = true;
            }

            if(sum<target){
                pointerA++;
            } else {
                pointerB--;
            }
        }

        return found?returnableArray:new int[]{-1,-1};
    }

    // Time Complexity : O(N)
    /*
      ignorableIndex to skip duplicate element index in second iteration
     */
    private int searchElement(int element, int[] array, int ignorableIndex){
        int index = Integer.MIN_VALUE;

        for(int i = 0;i<array.length;i++){
            if(array[i] == element && i != ignorableIndex){
                index = i;
            }
        }

        return index;
    }
}
