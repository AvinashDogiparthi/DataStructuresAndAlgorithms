package A_Two_Pointers.S_ReverseVowelsInAString_NONLEETCODE;

import java.util.Set;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        String input1 = "aeiep";
        String output1 = reverseVowelsInAStringUsingStack(input1);
        String output2 = reverseVowelsInAStringUsingTwoPointers(input1);

        System.out.println("Input String :"+input1+" Output String :"+output1);
        System.out.println("Input String :"+input1+" Output String :"+output2);

    }

    public static String reverseVowelsInAStringUsingStack(String usrInput){
        Set<Character> vowels = Set.of('A','E','I','O','U','a','e','i','o','u');
        Stack<Character> stackOfVowels = new Stack<>();

        // pushing vowels
        for(char c : usrInput.toCharArray()){
            if(vowels.contains(c)){
                stackOfVowels.push(c);
            }
        }

        StringBuilder result = new StringBuilder();

        for(char c : usrInput.toCharArray()){
            if(vowels.contains(c)){
                result.append(stackOfVowels.pop());
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String reverseVowelsInAStringUsingTwoPointers(String inputString){

        Set<Character> vowelsSet = Set.of('A','E','I','O','U','a','e','i','o','u');
        StringBuilder stringBuilder = new StringBuilder(inputString);
        int left = 0;
        int right = stringBuilder.length()-1;

        while(left < right){

            Character leftCharacter = stringBuilder.charAt(left);
            Character rightCharacter = stringBuilder.charAt(right);

            if(vowelsSet.contains(leftCharacter) && vowelsSet.contains(rightCharacter)){
                Character temp = leftCharacter;
                stringBuilder.setCharAt(left,rightCharacter);
                stringBuilder.setCharAt(right,temp);
                left++;
                right--;
            } else {
                if(vowelsSet.contains(leftCharacter)){
                    right --;
                } else if (vowelsSet.contains(rightCharacter)){
                    left++;
                }
            }
        }

        return stringBuilder.toString();
    }
}
