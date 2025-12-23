package Z_RandomProblems.ShuffleTheArray;

class SolutionWhichIsNotClean {
    public int[] shuffle(int[] nums, int n) {
        
        int[] firstHalf = new int[n];
        int[] secondHalf = new int[n];

        for(int i = 0;i<n;i++){
            firstHalf[i] = nums[i];
        }

        for(int i = n;i<nums.length;i++){
            secondHalf[i-n] = nums[i];
        }

        boolean takeFirst = true;

        int size = nums.length;
        int[] newArrays = new int[size];

        int index = 0;
        int trackerX = 0;
        int trackerY = 0;

        while(index < size){

            if(takeFirst){
                newArrays[index] = firstHalf[trackerX];
                trackerX++;
            } else {
                newArrays[index] = secondHalf[trackerY];
                trackerY++;
            }

            index++;
            takeFirst = !takeFirst;
        }

        return newArrays;
    }
}