package Two_Pointers_Pattern.E_SquaresOfASortedArray;

public class B_UsingTwoPointers {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 10,3};
        int[] solution = sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {

        int[] returnableArray = new int[nums.length];

        int startPointer = 0;
        int endPointer = nums.length-1;
        int targetTracker = nums.length-1;

        while(targetTracker >= 0){
            int numberAtStartPointer = nums[startPointer] * nums[startPointer];
            int numberAtEndPointer = nums[endPointer] * nums[endPointer];

            if(numberAtStartPointer > numberAtEndPointer){
                returnableArray[targetTracker] = numberAtStartPointer;
                startPointer++;
            } else {
                returnableArray[targetTracker] = numberAtEndPointer;
                endPointer--;
            }

            targetTracker--;
        }

        return returnableArray;
    }
}
