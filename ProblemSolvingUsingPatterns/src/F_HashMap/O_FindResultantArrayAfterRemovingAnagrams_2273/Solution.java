package F_HashMap.O_FindResultantArrayAfterRemovingAnagrams_2273;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        List<String> listOfValidString = new ArrayList<>();

        listOfValidString.add(words[0]);

        for(int i = 1;i<words.length;i++){

            if(!isAnagram(words[i-1],words[i])){
                listOfValidString.add(words[i]);
            }
        }

        return listOfValidString;
    }

    public boolean isAnagram(String s, String t){

        if(t.length() > s.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Character c : t.toCharArray()){

            if(map.containsKey(c)){

                map.put(c,map.get(c)-1);

                if(map.get(c) == 0){
                    map.remove(c);
                }
            } else {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        return map.isEmpty();
    }
}