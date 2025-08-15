package C_CyclicSort_Pattern.E_SetMismatch;

public class Solution {

    public static void main(String[] args) {
        int[] ans = findErrorNums(new int[]{1,2,2,4});
        System.out.println(ans);
    }

    public static int[] findErrorNums(int[] nums) {

        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            } else {
                i++;
            }
        }

        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index],index+1};
            }
        }

        return new int[]{-1,-1};
    }

    public static void swap(int[] arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
