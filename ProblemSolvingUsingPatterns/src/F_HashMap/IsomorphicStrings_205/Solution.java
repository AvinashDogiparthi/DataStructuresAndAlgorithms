package F_HashMap.IsomorphicStrings_205;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If already mapped, check consistency
            if (mapST.containsKey(c1) && mapST.get(c1) != c2) return false;
            if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) return false;

            // new mapping
            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }

        return true;
    }
}
