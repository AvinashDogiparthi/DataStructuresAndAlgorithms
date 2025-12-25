package M_BinarySearch.AE_FindSmallestLetterGreaterThanTarget_744;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int low = 0;
        int high = letters.length -1 ;
        char res = letters[0];
        int targetAscii = target - 'a';

        while(low <= high){

            int mid = low + (high - low)/2;
            int midAscii = letters[mid] - 'a';

            if(midAscii > targetAscii){
                high = mid - 1;
                res = letters[mid];
            } else{
                low = mid + 1;
            }
        }

        return res;
    }
}