package B_Sliding_Window.SubStringTemplateProblemsUsingSlidingWindow.A_FindAllAnagramsInAString;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        List<Integer> anagramsAtIndexes = findAnagrams("cbaebabacd","abc");
        System.out.println(anagramsAtIndexes);
    }

    // Time Complexity : O(N)
    // Space Complexity : O(1)
    public static List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;

        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();

        int begin = 0, end = 0;


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

                // we just have to add this condition here to the template solution to make it workable
                if(end-begin == t.length()){
                    result.add(begin);
                }
                begin++;
            }

        }
        return result;
    }
}
