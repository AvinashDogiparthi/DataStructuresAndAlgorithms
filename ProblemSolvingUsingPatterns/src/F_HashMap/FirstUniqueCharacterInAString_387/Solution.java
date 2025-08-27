package F_HashMap.FirstUniqueCharacterInAString_387;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int index = 0;

        while(index < s.length()){

            Character ch = s.charAt(index);

            if(map.get(ch) == 1){
                return index;
            }
            index++;
        }

        return -1;
    }
}
