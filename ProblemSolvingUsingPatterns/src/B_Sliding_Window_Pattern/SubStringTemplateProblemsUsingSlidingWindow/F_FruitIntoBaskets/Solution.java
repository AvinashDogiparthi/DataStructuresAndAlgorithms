package B_Sliding_Window_Pattern.SubStringTemplateProblemsUsingSlidingWindow.F_FruitIntoBaskets;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] fruits = new int[]{1,2,1};
        System.out.println(totalFruit(fruits));

    }

    public static int totalFruit(int[] fruits) {

        int start = 0, end = 0, len = 0;
        Map<Integer,Integer> map = new HashMap<>();

        int counter = map.size();

        while(end < fruits.length){

            int numAtEnd = fruits[end];
            map.put(numAtEnd,map.getOrDefault(numAtEnd,0)+1);
            if(map.get(numAtEnd) == 1) counter++;

            while(counter >= 3){
                int numAtStart = fruits[start];
                map.put(numAtStart,map.get(numAtStart)-1);
                if(map.get(numAtStart) == 0) {
                    counter--;
                    map.remove(numAtStart);
                }

                start++;
            }

            len = Math.max(end-start+1,len);
            end++;
        }

        return len;
    }


}
