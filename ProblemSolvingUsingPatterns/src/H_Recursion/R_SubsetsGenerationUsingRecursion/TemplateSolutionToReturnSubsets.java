package H_Recursion.R_SubsetsGenerationUsingRecursion;

import java.util.ArrayList;
import java.util.List;

public class TemplateSolutionToReturnSubsets {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        processSubSets(new ArrayList<>(), arr, 0,result);
        System.out.println(result); 
        // prints [ [1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], [] ]
    }

    /**
     * Time Complexity : O ( N * 2 ^ N )
     * Space Complexity : O ( N  )
     * @param p
     * @param arr
     * @param index
     * @return
     */
    public static void processSubSets(List<Integer> p, int[] arr, int index, List<List<Integer>> result) {

        if (index == arr.length) {
            result.add(new ArrayList<>(p)); // add copy of current subset
            return;
        }

        int element = arr[index];

        // 1. Include current element
        p.add(element);
        processSubSets(p, arr, index + 1,result);

        // backtrack
        p.remove(p.size() - 1);

        // 2. Exclude current element
        processSubSets(p, arr, index + 1,result);
    }
}
