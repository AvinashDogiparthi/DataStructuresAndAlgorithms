package H_Recursion.P_DeleteCharactersToMakeFancyString_1957;

public class Solution {

    public static void main(String[] args) {

        String ans1 = makeFancyString("leeetcode");
        System.out.println(ans1);

        String ans2 = makeFancyString("aaabaaaa");
        System.out.println(ans2);

        String ans3 = makeFancyString("aab");
        System.out.println(ans3);
    }

    public static String makeFancyString(String s){
        return removeConsecutiveCharacters(s,0,' ',0,new StringBuilder()).toString();
    }

    public static StringBuilder removeConsecutiveCharacters(String s, int index, char currentChar, int count, StringBuilder result){

        if(index == s.length()){
            return result;
        }

        char ch = s.charAt(index);
        int iterableCount = 0;

        if(currentChar == ch){
            iterableCount = count+1;
            if(iterableCount<2){
                result.append(ch);
            }
        } else {
            result.append(ch);
        }

        return removeConsecutiveCharacters(s,index + 1,ch,iterableCount,result);
    }
}
