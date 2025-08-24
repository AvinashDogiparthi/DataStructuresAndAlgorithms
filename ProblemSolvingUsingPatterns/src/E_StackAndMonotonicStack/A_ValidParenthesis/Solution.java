package E_StackAndMonotonicStack.A_ValidParenthesis;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i < s.length()){

            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {

                if(stack.isEmpty()){
                    return false;
                }


                if(c == ')' && stack.pop() != '('){
                    return false;
                }

                if(c == '}' && stack.pop() != '{'){
                    return false;
                }

                if(c == ']' && stack.pop() != '['){
                    return false;
                }
            }

            i++;
        }

        return stack.isEmpty();
    }
}
