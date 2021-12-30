package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionWithoutDuplicates {
    public static void main(String[] args) {

        String[] myStrings = {"string1", "string2", "string3", "string1", "string5"};
        Integer[] myNumbers = {1, 2, 3, 1, 5};

        System.out.println("\nArray of Strings objects:");
        System.out.println(Arrays.toString(myStrings));
        System.out.println("\nSet of Strings (without duplicates):");
        System.out.println(removeDuplicates(myStrings));

        System.out.println("\nArray of Integers objects: ");
        System.out.println(Arrays.toString(myNumbers));
        System.out.println("\nSet of Integer (without duplicates):");
        System.out.println(removeDuplicates(myNumbers));

    }

    public static <V> Collection<V> removeDuplicates(V[] aCollection) {
        return Arrays.stream(aCollection).collect(Collectors.toSet());
    }

}
