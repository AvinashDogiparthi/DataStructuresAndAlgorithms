package K_Graphs.Problems.BFS.AM_BusRoutes_815;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        int[][] routes = {{1,2,7},{3,6,7}};
        int source = 1;
        int target = 6;

        int result = numBusesToDestination(routes,source,target);
        System.out.println(result);
    }

    public static int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int bus = 0; bus < routes.length; bus++) {
            for (int station : routes[bus]) {
                map.putIfAbsent(station, new ArrayList<>());
                map.get(station).add(bus);
            }
        }

        Set<Integer> visitedBuses = new HashSet<>();
        Set<Integer> visitedStations = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;
        
            for (int i = 0; i < size; i++) {
            int currStation = queue.poll();
            
                for (int bus : map.getOrDefault(currStation, new ArrayList<>())) {
                    if (!visitedBuses.add(bus)) continue;
                    
                    for (int station : routes[bus]) {
                        if (station == target) return count;
                        if (visitedStations.add(station)) queue.offer(station);
                    }
                }
           }
        }

        return -1;
    }
}