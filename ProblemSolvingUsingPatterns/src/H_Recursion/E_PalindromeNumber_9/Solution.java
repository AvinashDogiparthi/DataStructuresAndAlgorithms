package H_Recursion.E_PalindromeNumber_9;

class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;

        return reverseInteger(x,0) == x;
    }

    public int reverseInteger(int n, int rev){

        if(n == 0){
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverseInteger(n/10,rev);
    }
}