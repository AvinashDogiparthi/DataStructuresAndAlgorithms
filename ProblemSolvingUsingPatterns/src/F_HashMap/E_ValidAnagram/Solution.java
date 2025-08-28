package F_HashMap.E_ValidAnagram;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(t.length() > s.length()) return false;
        
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char ch : t.toCharArray()){

            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)-1);

                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            } else {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }

        return map.isEmpty();
    }
}