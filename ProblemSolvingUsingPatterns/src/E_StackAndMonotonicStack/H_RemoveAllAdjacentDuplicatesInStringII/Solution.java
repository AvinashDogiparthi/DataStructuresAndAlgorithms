package E_StackAndMonotonicStack.H_RemoveAllAdjacentDuplicatesInStringII;

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
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(stack.isEmpty()){
                stack.push(new Pair(1,ch));
            } else {

                if(stack.peek().ch == ch){

                    stack.peek().count++;

                    if(stack.peek().count == k){
                        stack.pop();
                    }
                } else {
                    stack.push(new Pair(1,ch));
                }

            }
        }

        for(Pair pair : stack){
            for(int iteration = 0;iteration < pair.count;iteration++ ){
                result.append(pair.ch);
            }
        }

        return result.toString();
    }

    private static class Pair {
        char ch;
        int count;

        Pair(int count,char ch) {
            this.ch = ch;
            this.count = count;
        }
    }
}
