package F_HashMap.N_SumOfElementsWithFrequencyDivisibleByK_3712;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;

        Map<Integer,Integer> mapOfNumberFrequencies = generateFrequencyMap(nums);

        for(int a : mapOfNumberFrequencies.keySet()){

            if(mapOfNumberFrequencies.get(a) % k == 0){

                for(int i = 0;i<mapOfNumberFrequencies.get(a);i++){

                    sum = sum + a;
                }
            }
        }

        return sum;
    }

    public Map<Integer,Integer> generateFrequencyMap(int[] nums){

        Map<Integer,Integer> mapOfNumberFrequencies = new HashMap<>();

        for(int n : nums){
            mapOfNumberFrequencies.put(n,mapOfNumberFrequencies.getOrDefault(n,0)+1);
        }

        return mapOfNumberFrequencies;
    }
}