import java.util.*;

class Solution {
    public int[] topKFrequent(int[] arr, int k) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        // Count frequencies
        for (int each : arr) {
            int temp = map.getOrDefault(each, 0) + 1;
            map.put(each, temp);
        }

        // Convert map to list
        List<Map.Entry<Integer, Integer>> tempList =
                new ArrayList<>(map.entrySet());

        // Sort by frequency (ascending)
        tempList.sort(Map.Entry.comparingByValue());

        // Reverse to make descending
        Collections.reverse(tempList);

        // Store top K elements
        int[] result = new int[k];

        for (int index = 0; index < k; index++) {
            result[index] = tempList.get(index).getKey();
        }

        return result;
    }
}