package B_Sliding_Window_Pattern.FixedSizeWindow.B_MaximumSumOfDistinctSubarraysWithLengthK;

import java.util.HashMap;
import java.util.Map;

public class usingFixedSizeWindowandHashMap {
    public long maximumSubarraySum(int[] nums, int k) {

        long maximumSum = 0;
        long iterableSum = 0;
        Map<Integer,Integer> mapOfNumberFrequencies = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            mapOfNumberFrequencies.put(nums[i], mapOfNumberFrequencies.getOrDefault(nums[i],0)+1);
            iterableSum = iterableSum + nums[i];

            if(i>=k){
                iterableSum = iterableSum - nums[i-k];
                mapOfNumberFrequencies.put(nums[i-k],mapOfNumberFrequencies.get(nums[i-k])-1);
                if(mapOfNumberFrequencies.get(nums[i-k])==0){
                    mapOfNumberFrequencies.remove(nums[i-k]);
                }
            }

            // i >= k-1 is need to check the first window sum
            if(i>=k-1 && mapOfNumberFrequencies.size() == k){
                maximumSum = Math.max(iterableSum,maximumSum);
            }

        }

        return maximumSum;
    }
}
