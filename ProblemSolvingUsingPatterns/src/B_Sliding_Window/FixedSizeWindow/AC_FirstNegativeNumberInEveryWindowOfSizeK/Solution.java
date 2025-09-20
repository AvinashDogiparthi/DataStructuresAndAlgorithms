package B_Sliding_Window.FixedSizeWindow.AC_FirstNegativeNumberInEveryWindowOfSizeK;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        
        int n = arr.length;
        
        int i = 0;
        int j = 0;
        
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        
        while(j < n){
            
            if(arr[j] < 0){
                queue.add(arr[j]);
            }
            
            if(j-i+1 < k){
                j++;
            } else if (j - i + 1 == k){
                
                if(!queue.isEmpty()){
                    list.add(queue.peek());
                } else {
                    list.add(0);
                }
                
                if(!queue.isEmpty() && arr[i] == queue.peek()){
                queue.poll();
            }
            
            i++;
            j++;
            }
            
            
        }
        
        return list;
    }
}