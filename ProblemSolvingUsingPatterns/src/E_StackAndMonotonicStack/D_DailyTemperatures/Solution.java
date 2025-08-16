package E_StackAndMonotonicStack.D_DailyTemperatures;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[] result = dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        for(int n : result){
            System.out.println(n);
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i = 0;i<n;i++){
            int num = temperatures[i];

            while(!stack.isEmpty() && num > temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i - index;
            }

            stack.push(i);
        }

        return result;
    }
}
