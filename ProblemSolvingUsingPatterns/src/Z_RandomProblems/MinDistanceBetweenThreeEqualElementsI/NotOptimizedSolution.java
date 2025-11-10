package A_Two_Pointers.X_MinDistanceBetweenThreeEqualElementsI;

class NotOptimizedSolution {
    public int minimumDistance(int[] nums) {

        int minDistance = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){

                    if(nums[i] == nums[j] && nums[j] == nums[k]){
                        int distance = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        minDistance = Math.min(distance,minDistance);
                    }
                }
            }
        }

        return (minDistance == Integer.MAX_VALUE)? -1 : minDistance;
    }
}