package A_Two_Pointers_Pattern.C_Find_Duplicate;

import java.util.HashMap;
import java.util.Map;

public class B_UsingHashMap {

    public int findDuplicate(int[] nums) {
        int duplicateNumber = -1;
        Map<Integer,Integer> mapOfIntegers = new HashMap<Integer,Integer>();

        for(int i = 0;i<nums.length;i++){
            if(mapOfIntegers.containsKey(nums[i])){
                duplicateNumber = nums[i];
                return duplicateNumber;
            }

            mapOfIntegers.put(nums[i],i);
        }

        return duplicateNumber;

    }
}
