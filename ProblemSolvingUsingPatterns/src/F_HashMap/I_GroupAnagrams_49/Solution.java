package F_HashMap.I_GroupAnagrams_49;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        String[] list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat").toArray(new String[0]);
        System.out.println(groupAnagrams(list));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        Map<String,List<String>> frequencyMap = new HashMap<>();
        for(String str : strs){

            String countString = getCountString(str);

            frequencyMap.putIfAbsent(countString.toString(),new ArrayList<>());
            frequencyMap.get(countString.toString()).add(str);
        }

        result.addAll(frequencyMap.values());

        return result;

    }

    private static String getCountString(String str) {
        int[] count = new int[26];

        for(char ch : str.toCharArray()){
            count[ch - 'a']++;
        }

        StringBuilder countString = new StringBuilder();

        for(int i : count){
            countString.append(i).append("#");
        }
        return countString.toString();
    }
}