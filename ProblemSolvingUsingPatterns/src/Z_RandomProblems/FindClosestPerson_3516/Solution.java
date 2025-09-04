package Z_RandomProblems.FindClosestPerson_3516;

class Solution {
    public int findClosest(int x, int y, int z) {

        int difference1 = Math.abs(x-z);
        int difference2 = Math.abs(y-z);

        if(difference1 == difference2){
            return 0;
        }

        int min = Math.min(difference1,difference2);
        return min == difference1 ? 1 : 2;
    }
}