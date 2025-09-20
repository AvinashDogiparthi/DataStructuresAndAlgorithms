package E_StackAndMonotonicStack.M_LongestValidParentheses_32;

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        stack.push(-1);
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                stack.push(i);
            } 

            else {

                stack.pop();

                if (stack.isEmpty()) {

                    stack.push(i);
                } 
                
                else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        
        return max;
    }
}