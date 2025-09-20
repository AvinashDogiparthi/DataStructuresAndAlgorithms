package Z_RandomProblems.MaximumNumberOfWordsYouCanType_1935;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        boolean[] brokenCharArray = new boolean[26];
        int count = 0;

        for(char ch : brokenLetters.toCharArray()){
            brokenCharArray[ch - 'a'] = true;
        }

        for(String str : text.split(" ")){

            if(isValid(str,brokenCharArray)){
                count++;
            }
        }

        return count;
    }

    public boolean isValid(String str, boolean[] brokenCharArray){

        boolean isValid = true;
        for(char ch : str.toCharArray()){
            if(brokenCharArray[ch-'a']){
                return false;
            }
        }

        return isValid;
    }
}