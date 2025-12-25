package M_BinarySearch.AD_FloorOfANumber_GFG;

public class Solution {


    public static void main(String[] args) {
        int[] testcasearray = new int[]{1, 2, 8, 10, 10, 12, 19};

        int target1 = 5;
        System.out.println("floor of target 1 is : "+floorofanumber(testcasearray,target1));

        int target2 = 11;
        System.out.println("floor of target 2 is : "+floorofanumber(testcasearray,target2));
    }

    static int floorofanumber(int[] nums,int target){


        int low = 0;
        int high = nums.length -1 ;
        int res = -1;

        while(low <=high){

            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                low = mid + 1;
                res = mid;
            } else if (nums[mid] > target){
                high = mid - 1;
            }
        }

        return res;
    }
}
