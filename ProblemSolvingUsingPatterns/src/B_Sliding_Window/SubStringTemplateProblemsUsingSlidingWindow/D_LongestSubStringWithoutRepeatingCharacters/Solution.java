package B_Sliding_Window.SubStringTemplateProblemsUsingSlidingWindow.D_LongestSubStringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int longest = lengthOfLongestSubstring("abcabcbb");
        System.out.println(longest);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int begin = 0, end = 0, counter = 0, d = 0;

        while (end < s.length()) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) > 1) counter++;
            end++;

            while (counter > 0) {
                char charTemp = s.charAt(begin);
                if (map.get(charTemp) > 1) counter--;
                map.put(charTemp, map.get(charTemp)-1);
                begin++;
            }
            d = Math.max(d, end - begin);
        }
        return d;
    }
}
