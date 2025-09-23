package A_Two_Pointers.W_CompareVersionNumbers_165;

class Solution {
    public int compareVersion(String version1, String version2) {
        int index1 = 0, index2 = 0;
        int length1 = version1.length(), length2 = version2.length();

        while (index1 < length1 || index2 < length2) {
            int number1 = 0;
            while (index1 < length1 && version1.charAt(index1) != '.') {
                number1 = number1 * 10 + (version1.charAt(index1) - '0');
                index1++;
            }
            index1++; 

            int number2 = 0;
            while (index2 < length2 && version2.charAt(index2) != '.') {
                number2 = number2 * 10 + (version2.charAt(index2) - '0');
                index2++;
            }
            index2++; 

            if (number1 > number2) return 1;
            if (number1 < number2) return -1;
        }

        return 0;
    }
}