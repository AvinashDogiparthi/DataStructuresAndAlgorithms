package H_Recursion.B_BinarySearch_704;

class Solution {
    public int search(int[] nums, int target) {

        return recursiveSearch(nums,target,0,nums.length-1);
    }

    public int recursiveSearch(int[] nums, int target, int start, int end){

        if(start > end) return -1;

        int m = start + (end - start) / 2;

        if(nums[m] == target){
            return m;
        }

        if(target < nums[m] ){
            return recursiveSearch(nums,target,start,m - 1);
        }

        return recursiveSearch(nums,target,m+1,end);
    }
}