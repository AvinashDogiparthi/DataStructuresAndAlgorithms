package I_BackTracking.A_Subsets_78;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        List<List<Integer>> result = subsets(new int[]{1,2,3});
        System.out.println(result);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);

            backtrack(result, tempList, nums, i + 1);

            tempList.remove(tempList.size() - 1);
        }
    }
}