package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapCreator {
    public static void main(String[] args) {

        List<String> myStrings = Arrays.asList("foo", "bar", "delta", "gamma");
        List<Integer> myNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.print("1st List: ");
        System.out.println(myStrings);
        System.out.print("2nd List: ");
        System.out.println(myNumbers);

        System.out.println("\nOption 1:");
        System.out.println(createMapOption1(myNumbers, myStrings));
        System.out.println(createMapOption1(myStrings, myNumbers));

        System.out.println("\nOption 2:");
        System.out.println(createMapOption2(myNumbers, myStrings));
        System.out.println();
        System.out.println(createMapOption2(myStrings, myNumbers));
    }

    /**
     * the Method "Option 1" without error interception (null for extra keys, extra values ignored)
     *
     * @param keys
     * @param values
     * @param <K>
     * @param <V>
     * @return the Map
     */
    public static <K, V> Map<K, V> createMapOption1(List<K> keys, List<V> values) {

        Map<K, V> theMap = new TreeMap<>();
        for (int i = 0; i < keys.size(); i++) {

            if (values.size() <= i) {
                theMap.put(keys.get(i), null);
            } else {
                theMap.put(keys.get(i), values.get(i));
            }
        }
        return theMap;
    }

    /**
     * the Method "Option 2" with error interception when size K != V
     *
     * @param keys
     * @param values
     * @param <K>
     * @param <V>
     * @return the Map
     */
    public static <K, V> Map<K, V> createMapOption2(List<K> keys, List<V> values) {

        Map<K, V> theMap = new TreeMap<>();
        for (int i = 0; i < keys.size(); i++) {

            // Use try-catch to intercept error in the case K > V
            try {
                theMap.put(keys.get(i), values.get(i));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value is not enough for map.");
            }
        }

        // The case when K < V we will implement in slightly differ way
        if (values.size() - keys.size() > 0) {
            int extraValues = values.size() - keys.size();
            System.out.println("Key is not enough for map.\nThere are " + extraValues + " extra values.");
        }
        return theMap;
    }

}
