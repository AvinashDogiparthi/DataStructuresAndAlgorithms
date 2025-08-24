package E_StackAndMonotonicStack.I_RemoveKDigits;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String finalString = removeKdigits("1432219",3);
        System.out.println(finalString);
    }

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char digit : stack) {
            sb.append(digit);
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
