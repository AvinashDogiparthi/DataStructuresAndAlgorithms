package B_Sliding_Window.FixedSizeWindow.C_FindTheIndexOfTheFirstOccuranceInAString_28;

class SolutionUsingBuildInMethod {
    public int strStr(String haystack, String needle) {
        
        int lengthOfhaystack = haystack.length();
        int needleLength = needle.length();

        for(int i = 0;i<lengthOfhaystack-needleLength+1;i++){

            if(haystack.charAt(i) == needle.charAt(0)){

                if(haystack.substring(i,i+needleLength).equals(needle)){
                    return i;
                }
            }
        }

        return -1;
    }
}