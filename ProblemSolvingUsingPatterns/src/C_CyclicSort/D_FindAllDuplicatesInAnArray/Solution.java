package C_CyclicSort.D_FindAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> duplicates = findDuplicates(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> duplicatesList = new ArrayList<>();
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index + 1){
                duplicatesList.add(nums[index]);
            }
        }

        return duplicatesList;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
