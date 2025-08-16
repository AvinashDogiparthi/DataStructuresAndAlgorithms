package E_ProblemSolvingUsingStackAndMonotonicStack.B_NextGreaterElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int[] nextGreaterElements = nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        for(int i : nextGreaterElements){
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> monotonicElements = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!monotonicElements.isEmpty() && monotonicElements.peek() < num){
                map.put(monotonicElements.pop(),num);
            }

            monotonicElements.push(num);
        }

        for(int i = 0;i<nums1.length;i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }

        return nums1;
    }
}
