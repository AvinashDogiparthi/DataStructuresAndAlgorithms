package F_HashMap.F_WordPattern_290;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) return false;
            } else {
                if (used.contains(w)) return false;
                map.put(c, w);
                used.add(w);
            }
        }

        return true;
    }
}