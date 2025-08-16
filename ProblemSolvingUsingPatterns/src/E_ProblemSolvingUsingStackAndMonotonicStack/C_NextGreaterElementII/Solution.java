package E_ProblemSolvingUsingStackAndMonotonicStack.C_NextGreaterElementII;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[] resultArray = nextGreaterElements(new int[]{1,2,1});
        for(int n : resultArray){
            System.out.println(n);
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }
}
