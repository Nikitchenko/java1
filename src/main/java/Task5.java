import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        int[] myIntArray = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        String result = duplicatedArrayValues(myIntArray);

        System.out.println(result);

    }

    public static String duplicatedArrayValues(int[] myIntArray) {

        // ArrayList needed because we do not know how many duplicates exist
        ArrayList<Integer> duples = new <Integer>ArrayList();
        // will use the method which more "readable"
        Set mySet = new HashSet(Arrays.asList(myIntArray));
        for (Integer num : myIntArray) {
            if (mySet.add(num) == false) {
                duples.add(num);
            }
        }

        // ArrayList to Array
        Integer[] duplicates = new Integer[duples.size()];
        duplicates = duples.toArray(duplicates);

        // we want output as a String in format "6,12"
        StringJoiner resStr = new StringJoiner(",");
        for (int i = 0; i < duplicates.length; i++) {
            resStr.add("" + duplicates[i]);
        }
        //last detail to convert output to String
        return resStr.toString();
    }
}
