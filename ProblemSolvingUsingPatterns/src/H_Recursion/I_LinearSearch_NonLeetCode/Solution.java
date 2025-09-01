package H_Recursion.I_LinearSearch_NonLeetCode;

public class Solution {

    public static void main(String[] args) {
        int index1 = findTargetElement(new int[]{1,2,3,4,5,87,9},87);
        System.out.println(index1);

        int index2 = findTargetElement(new int[]{1,7,8,10},20);
        System.out.println(index2);
    }

    public static int findTargetElement(int[] nums, int target){
        return getTargetElementIndex(nums,target,0);
    }

    public static int getTargetElementIndex(int[] nums,int target,int index){

        if(index + 1 == nums.length){
            return -1;
        }

        if(nums[index] == target){
            return index;
        }

        return getTargetElementIndex(nums,target,index+1);
    }
}
