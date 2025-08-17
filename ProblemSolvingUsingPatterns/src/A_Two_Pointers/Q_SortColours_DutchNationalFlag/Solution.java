package A_Two_Pointers.Q_SortColours_DutchNationalFlag;

public class Solution {

    public void sortColors(int[] nums) {

        int slow = 0;
        int fast = nums.length - 1;
        int mid = 0;

        while(mid<=fast){
            if (nums[mid] == 0) { swap(nums, slow++, mid++); }
            else if (nums[mid] == 2) { swap(nums, mid, fast--); }
            else if (nums[mid] == 1) { mid++; }
        }
    }

    public void swap ( int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
