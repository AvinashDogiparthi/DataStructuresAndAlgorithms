package B_Sliding_Window.DynamicSizeWindow.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        int right = 0;
        int left = 0;

        HashSet<Character> setOfIntegers = new HashSet<>();

        while(right < n){

            char currentchar = s.charAt(right);

            while(setOfIntegers.contains(currentchar)){
                setOfIntegers.remove(s.charAt(left));
                left++;
            }

            setOfIntegers.add(currentchar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
