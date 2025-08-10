package B_Sliding_Window_Pattern.SubStringTemplateProblemsUsingSlidingWindow.E_LongestSubStringWithAtMostTwoDistinctCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int longest = lengthOfLongestSubstringTwoDistinct("eceba");
        System.out.println(longest);
    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start = 0, end = 0, counter = 0, len = 0;
        while(end < s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) == 1) counter++;
            end++;
            while(counter > 2){
                char cTemp = s.charAt(start);
                map.put(cTemp, map.get(cTemp) - 1);
                if(map.get(cTemp) == 0){
                    counter--;
                }
                start++;
            }
            len = Math.max(len, end-start);
        }
        return len;
    }
}
