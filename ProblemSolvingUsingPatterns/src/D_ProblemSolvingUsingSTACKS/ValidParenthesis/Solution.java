package D_ProblemSolvingUsingSTACKS.ValidParenthesis;

import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> mapOfPairs = Map.of(')','(',']','[','}','{');

        for(char c : s.toCharArray()){

            if(mapOfPairs.containsValue(c)){
                stack.push(c);
            } else {

                if(stack.isEmpty() || stack.peek() != mapOfPairs.get(c) ){
                    return false;
                }

                stack.pop();
            }
        }


        return stack.isEmpty();
    }
}
