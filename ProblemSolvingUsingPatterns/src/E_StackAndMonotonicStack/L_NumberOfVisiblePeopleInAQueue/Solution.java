package E_StackAndMonotonicStack.L_NumberOfVisiblePeopleInAQueue;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[] ans = canSeePersonsCount(new int[]{10,6,8,5,11,9});
        for(int i : ans){
            System.out.print(" "+i);
        }
    }

    public static int[] canSeePersonsCount(int[] heights) {

        int n = heights.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = n -1 ;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() < heights[i]){
                ans[i]++;
                stack.pop();
            }

            if(!stack.isEmpty()){
                ans[i]++;
            }

            stack.push(heights[i]);
        }

        return ans;
    }
}
