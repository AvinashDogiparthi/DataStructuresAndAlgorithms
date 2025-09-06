package H_Recursion.Q_RecursionSubsetsAndSubsequences.Subsequences;

public class TemplateSolution {

    public static void main(String[] args) {
        getSubSequences("","abc");
    }

    public static void getSubSequences(String p,String up){

        if(up.isEmpty()){

            // ignoring empty subsequence
            if(!p.isEmpty()){
                System.out.println(p);
            }

            return;
        }

        char ch = up.charAt(0);

        getSubSequences(p + ch,up.substring(1));
        getSubSequences(p,up.substring(1));
    }
}
