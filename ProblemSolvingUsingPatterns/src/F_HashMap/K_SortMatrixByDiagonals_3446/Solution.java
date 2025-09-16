package F_HashMap.K_SortMatrixByDiagonals_3446;

import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = grid.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){

                int d = i-j;
                map.putIfAbsent(d,new ArrayList<>());
                map.get(d).add(grid[i][j]);
            }
        }

        for(int d : map.keySet()){
            List<Integer> numbersAtD = map.get(d);

            if(d < 0){
                Collections.sort(numbersAtD);
            } else {
                numbersAtD.sort(Collections.reverseOrder());
            }
        }

        Map<Integer,Integer> index = new HashMap<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){

                int d = i-j;
                int idx = index.getOrDefault(d,0);
                grid[i][j] = map.get(d).get(idx);
                index.put(d,idx+1);
            }
        }

        return grid;
    }
}