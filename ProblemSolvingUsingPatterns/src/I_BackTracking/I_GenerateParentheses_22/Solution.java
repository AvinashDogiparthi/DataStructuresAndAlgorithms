package I_BackTracking.I_GenerateParentheses_22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses(result,"",0,0,n);

        return result;
    }

    public void generateParentheses(List<String> result, String up, int open, int closed, int n){

        if(up.length() == n*2){
            result.add(up);
            return;
        }

        if(open < n){
            generateParentheses(result,up+"(",open+1,closed,n);
        }

        if(closed < open){
            generateParentheses(result,up+")",open,closed+1,n);
        }
    }
}