package H_Recursion.T_CheckIfDigitsAreEqualInStringAfterOperationsI_3461;

class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length()-1 ; i++){
            int a = s.charAt(i) - '0';
            int b = s.charAt(i+1) - '0';
            sb.append((a+b)%10);
        }
        if(sb.length() == 2){
            if(sb.charAt(0) == sb.charAt(1)){
                return true;
            }
            else{
                return false;
            }
        }
        if(sb.length() < 2){
            return false;
        }
        return hasSameDigits(sb.toString());
    }
}