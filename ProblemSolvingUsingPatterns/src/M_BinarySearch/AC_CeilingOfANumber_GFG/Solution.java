package M_BinarySearch.AC_CeilingOfANumber_GFG;

public class Solution {


    public static void main(String[] args) {

        int[] testcase1 = new int[]{1, 2, 8, 10, 10, 12, 19};
        int target1 = 20;
        System.out.println("Ceiling of a number : "+ceilingOfANumber(testcase1,target1));

        int target2 = 5;
        System.out.println("Ceiling of a number : "+ceilingOfANumber(testcase1,target2));
    }

    static int ceilingOfANumber(int[] nums,int target){

        int low = 0;
        int high = nums.length-1;
        int res = -1;


        while(low <= high){

            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }


            if(nums[mid]<target){
                low = mid + 1;
            } else if (nums[mid] > target){
                high = mid -1 ;
                res = mid;
            }
        }

        return res;
    }
}
