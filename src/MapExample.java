import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);

        System.out.println("HashMap:");
        Iterator<Map.Entry<String, Integer>> hashMapIterator = hashMap.entrySet().iterator();
        while (hashMapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = hashMapIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Orange", 3);

        System.out.println("\nLinkedHashMap:");
        Iterator<Map.Entry<String, Integer>> linkedHashMapIterator = linkedHashMap.entrySet().iterator();
        while (linkedHashMapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = linkedHashMapIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);

        System.out.println("\nTreeMap:");
        Iterator<Map.Entry<String, Integer>> treeMapIterator = treeMap.entrySet().iterator();
        while (treeMapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = treeMapIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Orange", 3);

        System.out.println("\nHashtable:");
        Iterator<Map.Entry<String, Integer>> hashtableIterator = hashtable.entrySet().iterator();
        while (hashtableIterator.hasNext()) {
            Map.Entry<String, Integer> entry = hashtableIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
