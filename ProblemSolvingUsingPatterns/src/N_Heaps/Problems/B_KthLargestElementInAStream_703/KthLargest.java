package N_Heaps.Problems.B_KthLargestElementInAStream_703;

import java.util.PriorityQueue;

class KthLargest {

    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargest(int k, int[] nums) {
        
        this.k = k;
        minHeap  =  new PriorityQueue<>();

        for(int i : nums){
            minHeap.offer(i);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        
        this.minHeap.offer(val);

        if(minHeap.size()>k){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */