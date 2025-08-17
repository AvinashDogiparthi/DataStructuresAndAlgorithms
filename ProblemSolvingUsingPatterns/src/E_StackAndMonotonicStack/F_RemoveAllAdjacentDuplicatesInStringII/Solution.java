package E_StackAndMonotonicStack.F_RemoveAllAdjacentDuplicatesInStringII;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String finalString = removeDuplicates("abcd",2);
        System.out.println(finalString);

        System.out.println("--------------------------------------");
        String finalString1 = removeDuplicates("deeedbbcccbdaa",3);
        System.out.println(finalString1);

        System.out.println("--------------------------------------");
        String finalString2 = removeDuplicates("pbbcggttciiippooaais",2);
        System.out.println(finalString2);
    }

    public static String removeDuplicates(String s, int k) {

        Stack<Pair> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair(c, 1));
            }
        }

        StringBuilder result = new StringBuilder();
        for (Pair p : stack) {
            for (int i = 0; i < p.count; i++) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }

    private static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}
