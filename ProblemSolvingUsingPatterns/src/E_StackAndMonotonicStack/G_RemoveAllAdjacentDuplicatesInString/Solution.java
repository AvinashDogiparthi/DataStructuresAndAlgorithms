package E_StackAndMonotonicStack.G_RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String finalString = removeDuplicates("abbaca");
        System.out.println(finalString);
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){

            if(stack.isEmpty()){
                stack.push(c);
            } else {
                if(stack.peek() == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        for(char c : stack){
            result.append(c);
        }

        return result.toString();
    }
}
