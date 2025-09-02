package H_Recursion.L_SelectionSort;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[]  sortedResult = sortUsingSelectionSort(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(sortedResult));
    }

    public static int[] sortUsingSelectionSort(int[] nums){
        selectionSort(nums,nums.length,0,0);
        return nums;
    }

    public static void selectionSort(int[] nums,int i,int j, int max){
        if(i == 0){
            return;
        }

        if(j < i){

            if(nums[max] < nums[j]){
                selectionSort(nums,i,j+1,j);
            } else {
                selectionSort(nums, i, j + 1, max);
            }
        } else {

            swap(nums,i-1,max);
            selectionSort(nums,i-1,0,0);
        }
    }

    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
