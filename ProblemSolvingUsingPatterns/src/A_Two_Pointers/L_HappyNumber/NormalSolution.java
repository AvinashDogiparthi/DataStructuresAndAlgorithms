package A_Two_Pointers.L_HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class NormalSolution {

    public boolean isHappy(int n){

        boolean isHappy = false;
        while(n != 1 && n < 10){
            n = computeDigits(n);
            if(n == 1){
                isHappy = true;
            }
        }

        return isHappy;
    }

    public int computeDigits(int n){
        String numberString = Integer.toString(n);

        char[] charArray = numberString.toCharArray();
        List<Integer> digitsArray = new ArrayList<>();

        for(int i =0;i<charArray.length;i++){
            int digit = Integer.parseInt(String.valueOf(charArray[i]));
            digitsArray.add(digit);
        }

        int squaredSum = 0;
        for(int i :digitsArray){
            squaredSum = squaredSum + i * i;
        }

        return squaredSum;
    }
}
