package F_HashMap.J_NumberOfBoomerangs_447;

import java.util.HashMap;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap();
        int boomerangs = 0;
        for (int[] p1 : points) {
            for (int[] p2 : points) {
                int dist = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            for (Integer count : map.values())
                boomerangs += count * (count - 1);
            map.clear();
        }
        return boomerangs;
    }
}