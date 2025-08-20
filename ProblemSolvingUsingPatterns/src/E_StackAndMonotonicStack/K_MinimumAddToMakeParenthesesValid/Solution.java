package E_StackAndMonotonicStack.K_MinimumAddToMakeParenthesesValid;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        int ans = minAddToMakeValid("(((");
        System.out.println(ans);
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }
}
