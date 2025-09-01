package H_Recursion.F_CountNumberOfZerosInANumber_NonLeetCode;

public class Solution {

    public static void main(String[] args) {
        int count = countZeros(100100112,0);
        System.out.println(count);
    }

    public static int countZeros(int n, int currentCount){

        if(n == 0){
            return currentCount;
        }

        int digit = n % 10;
        if(digit == 0){
            currentCount = currentCount + 1;
        }

        return countZeros(n/10,currentCount);
    }
}
