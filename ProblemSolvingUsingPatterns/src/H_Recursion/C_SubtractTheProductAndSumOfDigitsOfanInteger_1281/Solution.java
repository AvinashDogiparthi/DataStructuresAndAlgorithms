package H_Recursion.C_SubtractTheProductAndSumOfDigitsOfanInteger_1281;

class Solution {
    public int subtractProductAndSum(int n) {
        
        return getProductOfDigits(n) - getSumOfDigits(n);
    }

    public int getProductOfDigits(int n){

        if(n == 0){
            return 1;
        }

        int digit = n % 10;
        return digit * getProductOfDigits(n/10);
    }

    public int getSumOfDigits(int n){

        if(n == 0){
            return 0;
        }

        int digit = n % 10;
        return digit + getSumOfDigits(n/10);
    }
}