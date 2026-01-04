package N_Heaps.Problems.A_KthLargestElementInAnArray_215;

import java.util.PriorityQueue;

class Solution {

    // Time Complexity : O(N log K )
    // Space Complexity : O(K)
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n : nums){
            minHeap.add(n);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        return minHeap.peek();
    }
}