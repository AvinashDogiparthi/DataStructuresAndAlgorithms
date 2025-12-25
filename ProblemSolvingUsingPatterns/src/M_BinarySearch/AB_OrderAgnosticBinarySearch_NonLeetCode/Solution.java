package M_BinarySearch.AB_OrderAgnosticBinarySearch_NonLeetCode;

public class Solution {

    public static void main(String[] args) {

        int[] ascendingOrderNums = new int[]{1,2,3,5,6,8};
        System.out.println(binarySearch(ascendingOrderNums,3));

        int[] descendingOrderNums = new int[]{8,7,6,4,3,2,1};
        System.out.println(binarySearch(descendingOrderNums,4));
    }


    public static int binarySearch(int[] nums, int target){


        int low = 0;
        int high = nums.length - 1;

        boolean isAscending = nums[low] < nums[high];

        while(low <= high){

            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(isAscending){

                if(nums[mid] < target){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {

                if(nums[mid] > target){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
