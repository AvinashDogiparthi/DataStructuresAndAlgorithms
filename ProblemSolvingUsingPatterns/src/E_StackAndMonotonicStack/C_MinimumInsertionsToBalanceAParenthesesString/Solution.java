package E_StackAndMonotonicStack.C_MinimumInsertionsToBalanceAParenthesesString;

public class Solution {

    public static void main(String[] args) {
        int minimumInsertions = minInsertions("())");
        int minimumInsertins2 = minInsertions("))())(");
        int minimumInsertions3 = minInsertions("(()))");

        System.out.println(minimumInsertions);
        System.out.println(minimumInsertins2);
        System.out.println(minimumInsertions3);
    }

    public static int minInsertions(String s) {
        int countBraces = 0;
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                countBraces += 1;
            }
            else{
                //Case 1-> Whenever a closing bracket is encountered, one case can be it is followed by another closing bracket and preceeded/not preceeded by an opening bracket(handled in this following if block)
                if(i+1<s.length() && s.charAt(i+1) == ')'){
                    if(countBraces > 0){
                        countBraces--; // It's balanced only.. Just decrement the opening bracket
                    }
                    else{
                        //This is the case for --> "))" It means we need to add 1 opening bracket --> "("
                        ans += 1;
                    }
                    i++;
                }
                else{
                    //Case 2 -> Whenever a closing bracket is encountered, another case can be it is not followed by another closing bracket and preceeded/not preceeded by an opening bracket(handled in this following if block)
                    if(countBraces > 0){
                        countBraces--;
                        ans += 1;//Add the last closing bracket to balance
                    }
                    else{

                        ans += 2;//Add the last closing bracket and first opening bracket(eg.test case-> ")")
                    }
                }
                //Finally we should return the 2times the number of countBraces(opening brackets remaining in excess)
            }
        }
        return ans+countBraces*2;
    }
}
