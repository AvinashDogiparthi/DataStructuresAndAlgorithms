package E_StackAndMonotonicStack.I_TrappingRainWater;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int ans = trap(new int[]{4,2,0,3,2,5});
        System.out.println(ans);
    }

    public static int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottom = stack.pop();
                if (stack.isEmpty()) break;

                int left = stack.peek();
                int width = i - left - 1;
                int boundedHeight = Math.min(height[i], height[left]) - height[bottom];

                ans += width * boundedHeight;
            }
            stack.push(i);
        }

        return ans;
    }
}
