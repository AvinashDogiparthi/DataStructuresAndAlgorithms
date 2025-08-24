package E_StackAndMonotonicStack.B_MinimumAddToMakeParenthesesValid;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int ans = minAddToMakeValid("(((");
        System.out.println(ans);
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){

            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(ch);
            } else {

                if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }

            i++;
        }

        return stack.size();
    }
}
