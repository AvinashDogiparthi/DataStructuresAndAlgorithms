package C_CyclicSort_Pattern.B_FindAllDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> missingNumbers = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(missingNumbers);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while(i < nums.length){

            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index +1 ){
                list.add(index+1);
            }
        }

        return list;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
