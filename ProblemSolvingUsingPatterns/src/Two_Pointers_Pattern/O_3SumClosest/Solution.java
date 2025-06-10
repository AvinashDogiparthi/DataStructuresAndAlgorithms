package Two_Pointers_Pattern.O_3SumClosest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        int nearestDistance = target-closestSum;

        for(int i = 0;i<nums.length-2;i++){

            int left = i + 1;
            int right = nums.length-1;

            while(left < right){

                int sum = nums[i]+nums[left]+nums[right];
                int distanceFromTarget = Math.abs(target-sum);

                if(distanceFromTarget < nearestDistance){
                    nearestDistance = distanceFromTarget;
                    closestSum = sum;
                }

                if(sum < target){
                    left++;
                } else if (sum > target){
                    right--;
                } else {
                    return target;
                }
            }
        }

        return closestSum;
    }
}
