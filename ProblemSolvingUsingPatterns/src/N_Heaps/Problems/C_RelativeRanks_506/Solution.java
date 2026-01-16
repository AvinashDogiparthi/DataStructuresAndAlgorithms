package N_Heaps.Problems.C_RelativeRanks_506;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] result = new String[n];

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            maxHeap.offer(score[i]);
            indexMap.put(score[i], i);
        }

        int rank = 1;

        while (!maxHeap.isEmpty()) {
            int currScore = maxHeap.poll();
            int index = indexMap.get(currScore);

            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }

            rank++;
        }

        return result;
    }
}
