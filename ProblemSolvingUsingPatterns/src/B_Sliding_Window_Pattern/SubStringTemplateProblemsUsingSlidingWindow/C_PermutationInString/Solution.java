package B_Sliding_Window_Pattern.SubStringTemplateProblemsUsingSlidingWindow.C_PermutationInString;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int counter = map.size();
        int begin = 0;
        int end = 0;
        int len = Integer.MAX_VALUE;

        while(end < s2.length()){

            char c = s2.charAt(end);

            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;

            while(counter == 0){
                char beginChar = s2.charAt(begin);
                if(map.containsKey(beginChar)){
                    if(map.get(beginChar) == 0) counter++;
                    map.put(beginChar,map.get(beginChar)+1);
                }

                // added this if condition to check the length
                if(end-begin == s1.length()) return true;
                begin++;
            }
        }

        return false;
    }
}
