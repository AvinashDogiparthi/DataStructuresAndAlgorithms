package H_Recursion.H_CheckArrayIsSortedOrNot_NonLeetCode;

public class Solution {

    public static void main(String[] args) {
        boolean ans1 = isSortedArray(new int[]{1,2,4,5,6});
        System.out.println(ans1);
        boolean ans2 = isSortedArray(new int[]{1,2,3,9,8});
        System.out.println(ans2);
        boolean ans3 = isSortedArray(new int[]{1,2,4,3,8,9});
        System.out.println(ans3);
    }

    public static boolean isSortedArray(int[] nums){
        return checkSortedOrNot(nums,0);
    }

    public static boolean checkSortedOrNot(int[] nums,int index){

        if(index+1 == nums.length){
            return true;
        }

        if(nums[index] > nums[index + 1]){
            return false;
        }

        return checkSortedOrNot(nums,index+1);
    }
}
