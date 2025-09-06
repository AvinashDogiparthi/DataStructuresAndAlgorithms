package H_Recursion.Q_RecursionSubsetsAndSubsequences.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class TemplateSolutiontoreturnList {

    public static void main(String[] args) {
        List<String> result = getSubSequences("", "abc");
        System.out.println(result);  // prints [abc, ab, ac, a, bc, b, c]
    }

    public static List<String> getSubSequences(String p, String up) {
        List<String> result = new ArrayList<>();

        if (up.isEmpty()) {
            // ignoring empty subsequence
            if (!p.isEmpty()) {
                result.add(p);
            }
            return result;
        }

        char ch = up.charAt(0);

        // include current character
        result.addAll(getSubSequences(p + ch, up.substring(1)));

        // exclude current character
        result.addAll(getSubSequences(p, up.substring(1)));

        return result;
    }
}
