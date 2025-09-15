package I_BackTracking.J_Combinations_77;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        List<List<Integer>> result = combine(2,4);
        System.out.println(result);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        backtrack(1, comb, res, n, k);
        return res;
    }

    private static void backtrack(int start, List<Integer> combinationsList, List<List<Integer>> res, int n, int k) {
        if (combinationsList.size() == k) {
            res.add(new ArrayList<>(combinationsList));
            return;
        }

        for (int num = start; num <= n; num++) {
            combinationsList.add(num);
            backtrack(num + 1, combinationsList, res, n, k);
            combinationsList.remove(combinationsList.size() - 1);
        }
    } 
}