package Z_RandomProblems.MaximumNumberOfWordsYouCanType_1935;

class BruteForceSolution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String[] strings = text.split(" ");
        int count = 0;

        for(String str : strings){

            boolean valid = true;
            
            for(char ch : brokenLetters.toCharArray()){

                if(!checkIsValidString(ch,str)){
                    valid = false;
                }

            }

            if(valid){
                count = count + 1;
            }
        }

        return count;
    }

    public boolean checkIsValidString(Character ch, String str){

        boolean valid = true;

        for(char c : str.toCharArray()){

            if(ch == c){
                valid = false;
            }
        }

        return valid;
    }
}