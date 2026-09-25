package A_Two_Pointers.R_BackSpaceStringCompare;

public class SolutionUsingTwoPointers {
    public boolean backspaceCompare(String S, String T) {
        char[] sChars = S.toCharArray();
        char[] tChars = T.toCharArray();

        int k = processString(sChars);
        int p = processString(tChars);

        if (k != p) return false;

        for (int i = 0; i < k; i++) {
            if (sChars[i] != tChars[i]) return false;
        }

        return true;
    }

    private int processString(char[] chars) {
        int writeIndex = 0;

        for (char currentChar : chars) {
            if (currentChar == '#') {
                if (writeIndex > 0) {
                    writeIndex--;
                }
            } else {
                chars[writeIndex++] = currentChar;
            }
        }

        return writeIndex;
    }

}
