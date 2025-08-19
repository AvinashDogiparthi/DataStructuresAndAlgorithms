package E_StackAndMonotonicStack.H_123Pattern;

import java.util.Stack;

public class Solution {

    public boolean find132pattern(int[] nums) {

        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for( int i = nums.length - 1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() < nums[i]){
                max = stack.pop();
            }

            if(nums[i] > max) stack.push(nums[i]);
            if(nums[i] < max) return true;
        }

        return false;
    }
}
