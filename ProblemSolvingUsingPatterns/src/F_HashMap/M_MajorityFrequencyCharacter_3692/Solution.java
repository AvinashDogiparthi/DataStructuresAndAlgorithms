package F_HashMap.M_MajorityFrequencyCharacter_3692;

import java.util.*;

class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, List<Character>> groupMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            groupMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(entry.getKey());
        }

        int bestFreq = -1;
        int bestSize = -1;

        for (Map.Entry<Integer, List<Character>> entry : groupMap.entrySet()) {
            int freq = entry.getKey();
            int size = entry.getValue().size();

            if (size > bestSize || (size == bestSize && freq > bestFreq)) {
                bestSize = size;
                bestFreq = freq;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : groupMap.get(bestFreq)) {
            result.append(ch);
        }

        return result.toString();
    }
}
