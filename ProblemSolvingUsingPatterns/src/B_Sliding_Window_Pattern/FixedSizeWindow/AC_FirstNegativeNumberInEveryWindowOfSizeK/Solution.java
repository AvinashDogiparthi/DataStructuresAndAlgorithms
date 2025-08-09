package B_Sliding_Window_Pattern.FixedSizeWindow.AC_FirstNegativeNumberInEveryWindowOfSizeK;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    static List<Integer> firstNegInt(int arr[], int k) {
        // Result list to store the first negative integer for each window
        List<Integer> result = new ArrayList<>();

        // Deque to store indexes of negative numbers in the current window
        Deque<Integer> dq = new LinkedList<>();

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {

            // If current element is negative, store its index in deque
            // We store indexes (not values) so we can easily check if they fall out of the window
            if (arr[i] < 0) {
                dq.addLast(i);
            }

            // Remove elements from front of deque if they are out of the current window
            // "i - k" represents the index just before the start of the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Once the first window is formed (i >= k - 1), start recording results
            if (i >= k - 1) {
                // If deque is not empty, the front index corresponds to first negative in current window
                if (!dq.isEmpty()) {
                    result.add(arr[dq.peekFirst()]);
                }
                // If deque is empty, there is no negative number in current window
                else {
                    result.add(0);
                }
            }
        }

        // Return the list of first negative integers for each window
        return result;
    }
}
