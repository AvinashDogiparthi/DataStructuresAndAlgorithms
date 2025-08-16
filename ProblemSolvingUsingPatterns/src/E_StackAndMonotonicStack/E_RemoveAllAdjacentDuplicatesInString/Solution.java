package E_StackAndMonotonicStack.E_RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String finalString = removeDuplicates("abbaca");
        System.out.println(finalString);
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}
