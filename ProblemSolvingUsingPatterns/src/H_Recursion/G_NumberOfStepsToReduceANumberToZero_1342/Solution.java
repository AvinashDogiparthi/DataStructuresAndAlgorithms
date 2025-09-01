package H_Recursion.G_NumberOfStepsToReduceANumberToZero_1342;

class Solution {
    public int numberOfSteps(int num) {
        return neededSteps(num, 0);
    }

    public int neededSteps(int n, int stepsCount) {
        if (n == 0) {
            return stepsCount;
        }

        if (isOdd(n)) {
            return neededSteps(n - 1, stepsCount + 1);
        } else {
            return neededSteps(n / 2, stepsCount + 1);
        }
    }

    public boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
