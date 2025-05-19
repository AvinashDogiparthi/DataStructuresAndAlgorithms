package Two_Pointers_Pattern.A_TwoSum;

import java.util.Arrays;

public class A_SolutionUsingTwoPointers {

    public int[] twoSum(int[] nums, int target) {

        int[] copiedArray = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int pointerA = 0;
        int pointerB = nums.length-1;
        int[] returnableArray = new int[2];
        int iterableSum = 0;
        boolean found = false;

        // Time Complexity : O(N)
        while(pointerA < pointerB){

            //baseCondition
            iterableSum = nums[pointerA] +nums[pointerB];
            if(iterableSum==target){

                int pointerAValueIndex = searchElement(nums[pointerA],copiedArray,-1);
                int pointerBValueIndex = searchElement(nums[pointerB],copiedArray,pointerAValueIndex);

                if(pointerAValueIndex == pointerBValueIndex){
                    pointerBValueIndex = pointerBValueIndex + 1;
                }
                returnableArray[0] = pointerAValueIndex;
                returnableArray[1] = pointerBValueIndex;
                found = true;
            }


            if(iterableSum<target){
                pointerA++;
            } else {
                pointerB--;
            }
        }

        return found ? returnableArray : new int[]{-1,-1};
    }


    // Time Complexity : O(N)
    int searchElement(int element, int[] array, int ignorableIndex){

        int elementIndex = Integer.MIN_VALUE;

        for(int i = 0 ;i<array.length;i++){
            if(array[i] == element && i != ignorableIndex){
                return i;
            }
        }

        return elementIndex;

    }
}
