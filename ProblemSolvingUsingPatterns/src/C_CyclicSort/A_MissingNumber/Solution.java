package C_CyclicSort.A_MissingNumber;

class Solution {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
    }

    public static int missingNumber(int[] nums) {

        int i = 0;
        while(i<nums.length){

            int correct = nums[i];
            if(correct < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }

        for(int index = 0;index<nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }


    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}