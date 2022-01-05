package collections;

import java.util.*;

public class ChangerMapKV {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("C", 1);
        myMap.put("a", 5);
        myMap.put("b", 2);
        myMap.put("d", 1);
        myMap.put("r", 2);

        System.out.println("My original Map:\n" + myMap);
        System.out.println("Reversed Map:\n" + reverseMap(myMap));
        System.out.println("Swapped Map:\n" + swapKeysToValues(myMap));

    }

    /**
     * the Method ignores "extra" (new) Values
     *
     * @param aMap
     * @param <K>
     * @param <V>
     * @return reversed Map,
     */
    public static <K, V> Map<V, K> reverseMap(Map<K, V> aMap) {
        Map<V, K> reversedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : aMap.entrySet())
            reversedMap.put(entry.getValue(), entry.getKey());
        return reversedMap;
    }

    /**
     * the Method stores "extra" (new) Values as Sets
     *
     * @param aMap
     * @param <K>
     * @param <V>
     * @return Map with swapped Keys and Values
     */

    public static <K, V> Map<V, Collection<K>> swapKeysToValues(Map<K, V> aMap) {
        Map<V, Collection<K>> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : aMap.entrySet()) {

            if (!swappedMap.containsKey(entry.getValue())) {
                Set<K> aset1 = new HashSet<>(Arrays.asList(entry.getKey()));
                swappedMap.put(entry.getValue(), aset1);
            } else {
                Set<K> aset2 = new HashSet<>();
                aset2.addAll(swappedMap.get(entry.getValue()));
                aset2.add(entry.getKey());
                swappedMap.put(entry.getValue(), aset2);
            }
        }
        return swappedMap;
    }

}
