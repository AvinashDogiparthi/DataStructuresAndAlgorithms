package A_Two_Pointers_Pattern.A_TwoSum_Easy;

import java.util.HashMap;
import java.util.Map;

public class C_OptimizedSolutionUsingHashMap {

    // Time Complexity : O(N)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapOfNumbers = new HashMap<Integer, Integer>();
        int[] returnableArray = new int[2];
        boolean found = false;

        for(int i = 0 ;i<nums.length;i++){

            int currentValue = nums[i];

            // storing value as key and it's value as index
            if(mapOfNumbers.containsKey(target-currentValue)){
                returnableArray[0] = i;
                returnableArray[1] = mapOfNumbers.get(target-currentValue);
                found = true;
            } else {
                mapOfNumbers.put(currentValue,i);
            }
        }

        return found?returnableArray:new int[]{-1,-1};
    }
}
