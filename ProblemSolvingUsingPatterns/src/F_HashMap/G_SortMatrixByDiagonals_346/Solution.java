package F_HashMap.G_SortMatrixByDiagonals_346;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        int[][] grid = {
                {1, 7, 3},
                {9, 8, 2},
                {4, 5, 6}
        };

        int[][] sortedGrid = sortMatrix(grid);

        System.out.println(Arrays.deepToString(sortedGrid));
    }
    public static int[][] sortMatrix(int[][] grid) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = grid.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){

                int d = i - j;
                map.putIfAbsent(d,new ArrayList<>());
                map.get(d).add(grid[i][j]);
            }
        }

        for(int d : map.keySet()){

            List<Integer> gridList = map.get(d);

            if(d < 0){
                Collections.sort(gridList);
            } else {
                gridList.sort(Collections.reverseOrder());
            }
        }

        Map<Integer,Integer> index = new HashMap<>();

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){

                int d = i - j;
                int idx = index.getOrDefault(d,0);
                grid[i][j] = map.get(d).get(idx);
                index.put(d,idx+1);
            }
        }

        return grid;        
    }
}