package H_Recursion.O_SkipACharacter_NonLeetCode;

public class Solution {

    public static void main(String[] args) {
        String ans = skipCharacter("baccad",'a');
        System.out.println(ans);

        String ans2 = skipCharacter("bccd",'c');
        System.out.println(ans2);
    }

    public static String skipCharacter(String s, Character c){
        return skipUsingRecursion(s,c,0,new StringBuilder()).toString();
    }

    public static StringBuilder skipUsingRecursion(String s, Character c, int index, StringBuilder result){

        if(index == s.length()){
            return result;
        }

        char ch = s.charAt(index);
        if(ch != c){
            result.append(ch);
        }

        return skipUsingRecursion(s,c,index+1,result);
    }
}
