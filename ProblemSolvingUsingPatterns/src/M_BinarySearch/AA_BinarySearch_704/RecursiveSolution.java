package M_BinarySearch.AA_BinarySearch_704;

class RecursiveSolution {
    public int recursiveSerch(int[] nums, int target) {
        return recursiveSearch(nums,target,0,nums.length-1);
    }

    public int recursiveSearch(int[] nums, int target, int low, int high){

        if(low > high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] < target){
            return recursiveSearch(nums,target, mid + 1, high);
        } else {
            return recursiveSearch(nums,target, low, mid-1);
        }
    }
}