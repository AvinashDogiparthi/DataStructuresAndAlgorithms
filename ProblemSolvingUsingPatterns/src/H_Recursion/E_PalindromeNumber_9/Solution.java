package H_Recursion.E_PalindromeNumber_9;

class Solution {

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(121);
        System.out.println(isPalindrome);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        return x == reverseNumber(x,0);
    }

    public static int reverseNumber(int n, int rev){

        if(n == 0){
            return rev;
        }

        int digit = n % 10;
        int newRev = rev * 10 + digit;

        return reverseNumber(n/10,newRev);
    }
}