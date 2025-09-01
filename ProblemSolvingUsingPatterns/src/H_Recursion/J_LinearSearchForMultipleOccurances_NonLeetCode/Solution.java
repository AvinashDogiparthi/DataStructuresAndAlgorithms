package H_Recursion.J_LinearSearchForMultipleOccurances_NonLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> indexes = getIndexList(new int[]{1,1,2,4,3,6},1);
        for(int i : indexes){
            System.out.print(i+" ");
        }
        System.out.println();

        List<Integer> indexes2 = getIndexList(new int[]{1,2,3,5,6,7,8,8,8,5,5,5,3,3,3,3,3},8);
        for(int i : indexes2){
            System.out.print(i+" ");
        }
        System.out.println();

        List<Integer> indexes3 = getIndexList(new int[]{1,2,3,5,6,7,8,8,8,5,5,5,3,3,3,3,3},100);
        for(int i : indexes3){
            System.out.print(i+" ");
        }
    }

    public static List<Integer> getIndexList(int[] nums, int target){
        return findIndexes(nums,target,0,new ArrayList<>());
    }

    public static List<Integer> findIndexes(int[] nums, int target, int index, List<Integer> indexesList){

        if(index + 1 == nums.length){
            return indexesList;
        }

        if(nums[index] == target){
            indexesList.add(index);
        }

        return findIndexes(nums,target,index+1,indexesList);
    }
}
