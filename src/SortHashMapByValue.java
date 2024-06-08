import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        // Step 1: Create and populate the HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 30);
        map.put("cherry", 20);
        map.put("date", 25);
        map.put("elderberry", 15);

        // Step 2: Convert the HashMap to a List of Map.Entry
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort the list using a custom comparator
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Optional: Convert the sorted list back to a LinkedHashMap to maintain insertion order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
