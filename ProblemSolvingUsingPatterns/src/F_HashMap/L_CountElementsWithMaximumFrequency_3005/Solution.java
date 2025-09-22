package F_HashMap.L_CountElementsWithMaximumFrequency_3005;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer,Integer> mapOfCount = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int i : nums){

            mapOfCount.put(i,mapOfCount.getOrDefault(i,0)+1);
            max = Math.max(max, mapOfCount.get(i));
        }

        int countOfMaximumValues = 0;

        for(int i : mapOfCount.values()){

            if(i==max){
                countOfMaximumValues = countOfMaximumValues+ i;
            }

        }

        return countOfMaximumValues;
    }
}