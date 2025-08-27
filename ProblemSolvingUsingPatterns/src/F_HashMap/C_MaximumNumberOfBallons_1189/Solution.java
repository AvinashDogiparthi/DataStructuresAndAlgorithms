package F_HashMap.C_MaximumNumberOfBallons_1189;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character,Integer> map = new HashMap<>();


        for(char c : text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int b = map.getOrDefault('b',0);
        int a = map.getOrDefault('a',0);
        int l = map.getOrDefault('l',0) / 2;
        int o = map.getOrDefault('o',0) / 2;
        int n = map.getOrDefault('n',0);

        return Math.min(Math.min(Math.min(a,b),Math.min(l,o)),n);
    }
}