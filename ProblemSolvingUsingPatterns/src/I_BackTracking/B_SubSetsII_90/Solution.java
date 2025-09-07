package I_BackTracking.B_SubSetsII_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;

        Arrays.sort(nums);
        processSubSets(result, nums,0, new ArrayList<>());
        return result;
    }

    public void processSubSets(List<List<Integer>> result, int[] nums, int index, List<Integer> tempList){

        result.add(new ArrayList<>(tempList));

        for(int i = index;i<nums.length;i++){

            if(i > index && nums[i] == nums[i-1]) continue;

            tempList.add(nums[i]);

            processSubSets(result,nums,i + 1,tempList);

            tempList.remove(tempList.size()-1);
        }
    }
}