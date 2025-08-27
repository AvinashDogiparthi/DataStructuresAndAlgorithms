package F_HashMap.LargestUniqueNumber_1133;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int largestUniqueNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int index = 0;
        int max = Integer.MIN_VALUE;

        while(index < nums.length){
            int number = nums[index];

            if(map.get(number) == 1 && number > max){
                max = number;
            }

            index++;
        }

        if(max == Integer.MIN_VALUE) return -1;

        return max;
    }
}
