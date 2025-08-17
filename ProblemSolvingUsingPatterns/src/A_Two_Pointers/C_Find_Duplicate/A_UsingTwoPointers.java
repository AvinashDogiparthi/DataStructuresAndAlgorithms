package A_Two_Pointers.C_Find_Duplicate;

import java.util.Arrays;

public class A_UsingTwoPointers {

    public int findDuplicate(int[] nums) {
        int duplicateNumber = -1;

        // sorting will take O(nlogn) time complexity
        Arrays.sort(nums);

        int pointerA = 0;
        int pointerB = pointerA + 1;

        for(int i = 0 ;i<nums.length-1;i++){
            if(nums[pointerA] == nums[pointerB]){
                duplicateNumber = nums[pointerA];
            }

            pointerA++;
            pointerB++;
        }

        return duplicateNumber;

    }
}
