package B_Sliding_Window.SubStringTemplateProblemsUsingSlidingWindow.B_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        String solution = minWindow("ADOBECODEBANC","ABC");
        System.out.println(solution);
    }

    public static String minWindow(String s, String t) {
        if(t.length()> s.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int counter = map.size();

        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;

        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;

            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    if(map.get(tempc) == 0){
                        counter++;
                    }
                    map.put(tempc, map.get(tempc) + 1);
                }
                if(end-begin < len){
                    len = end - begin;
                    head = begin;
                }
                begin++;
            }

        }
        if(len == Integer.MAX_VALUE) return "";
        return s.substring(head, head+len);
    }
}
