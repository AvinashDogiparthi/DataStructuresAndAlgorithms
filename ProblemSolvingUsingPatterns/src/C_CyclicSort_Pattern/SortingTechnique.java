package C_CyclicSort_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTechnique {

    public static void main(String[] args) {
        int[] streamOfIntegers = new int[]{4,2,3,1,5,7,6,8};
        swapAndSort(streamOfIntegers);
        for(int i :streamOfIntegers){
            System.out.print(i+", ");
        }
        System.out.println();

        List<Integer> listOfNumbers = Arrays.asList(4,2,3,1,5,7,6,8);
        swapAndSort(listOfNumbers);
        System.out.println(listOfNumbers);

        List<Integer> input = Arrays.asList(3, 5, 2, 1, 4);
        swapAndSort(input);
        System.out.println(input);
    }

    public static void swapAndSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int value = arr[i];
            int correctIndex = value -1 ;
            if(value != arr[correctIndex]){
                int temp = value;
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }


    public static List<Integer> swapAndSort(List<Integer> listOfNumbers) {
        int i = 0;
        while (i < listOfNumbers.size()) {
            int num = listOfNumbers.get(i);
            if (num - 1 != i && listOfNumbers.get(num - 1) != num) {
                // swap listOfNumbers[i] with listOfNumbers[num - 1]
                Collections.swap(listOfNumbers, i, num - 1);
            } else {
                i++;
            }
        }
        return listOfNumbers;
    }

}
