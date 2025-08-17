package B_Sliding_Window.DynamicSizeWindow.LongestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int begin = 0, end = 0;
        int maxCount = 0;
        int maxLength = 0;

        while (end < s.length()) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);

            maxCount = Math.max(maxCount, map.get(c));

            while ((end - begin + 1) - maxCount > k) {
                char leftChar = s.charAt(begin);
                map.put(leftChar, map.get(leftChar) - 1);
                begin++;
            }

            maxLength = Math.max(maxLength, end - begin + 1);
            end++;
        }
        return maxLength;
    }
}
