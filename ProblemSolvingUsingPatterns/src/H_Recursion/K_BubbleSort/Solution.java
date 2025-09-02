package H_Recursion.K_BubbleSort;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] result1 = sortUsingBubbleSort(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(result1));
    }

    public static int[] sortUsingBubbleSort(int[] nums){
        bubbleSort(nums,nums.length,0);
        return nums;
    }

    public static void bubbleSort(int[] nums,int i, int j){
        if(i == 0){
            return;
        }

        if(j < i){
            if(nums[j] > nums[i]){
                swap(nums,j,i);
            }
            bubbleSort(nums,i,j+1);
        } else {
            bubbleSort(nums,i-1,0);
        }

    }

    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
