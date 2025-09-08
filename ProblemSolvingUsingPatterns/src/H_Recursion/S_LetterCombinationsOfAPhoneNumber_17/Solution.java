package H_Recursion.S_LetterCombinationsOfAPhoneNumber_17;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        List<String> finalLetters = letterCombinations("23");
        System.out.println(finalLetters);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> finalPermutations = new ArrayList<>();

        if(digits.isEmpty() || digits == null) return finalPermutations;
        processPermutations(finalPermutations,"",digits);
        return finalPermutations;
    }

    public static void processPermutations(List<String> list,String p, String up){

        if(up.isEmpty()){
            list.add(p);
            return;
        }


        int digit = up.charAt(0) - '0';
        String stringOfLetters  = letters[digit];

        if(stringOfLetters.isEmpty()){
            processPermutations(list,p,up.substring(1));
            return;
        }

        for(char ch : stringOfLetters.toCharArray()){
            processPermutations(list,p+ch,up.substring(1));
        }
    }
}