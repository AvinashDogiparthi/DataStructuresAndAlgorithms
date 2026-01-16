package B_Sliding_Window.FixedSizeWindow.C_FindTheIndexOfTheFirstOccuranceInAString_28;

class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0;i<n-m+1;i++){

            int j;

            if(haystack.charAt(i) == needle.charAt(0)){

                for(j = 0;j<m;j++){

                    if(haystack.charAt(i + j) != needle.charAt(j)){
                        break;
                    }
                }

                if(j == m){
                    return i;
                }
            }
        }

        return -1;
    }
}