package E_StackAndMonotonicStack.A_ValidParenthesis;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c =='[' || c == '{'){
                stack.push(c);
            } else {

                if(stack.isEmpty()){
                    return false;
                }

                if(c == ')'){
                    if( stack.pop() != '('){
                        return false;
                    }
                }

                if(c == ']'){
                    if(stack.pop() != '['){
                        return false;
                    }
                }

                if(c == '}'){
                    if( stack.pop() != '{'){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
