package Z_RandomProblems.ConcatenationOfArray;

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int size = nums.length;
        int doubleSize = size + size;
        int[] newArray = new int[doubleSize];

        int index = 0;

        while(index < doubleSize ){

            newArray[index] = nums[index%size];
            index++;
        }

        return newArray;
    }
}