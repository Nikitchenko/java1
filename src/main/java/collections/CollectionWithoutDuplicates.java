package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionWithoutDuplicates {
    public static void main(String[] args) {

        String[] myStrings = {"string1", "string2", "string3", "string1", "string5"};
        Collection<String> myStringsCollection = Arrays.asList(myStrings);
        Integer[] myNumbers = {1, 2, 3, 1, 5};
        Collection<Integer> myNumbersCollection = Arrays.asList(myNumbers);

        System.out.println("\nCollection of Strings objects:");
        System.out.println(myStringsCollection);
        System.out.println("\nSet of Strings (without duplicates):");
        System.out.println(removeDuplicates(myStringsCollection));

        System.out.println("\nCollection of Integers objects: ");
        System.out.println(myNumbersCollection);
        System.out.println("\nSet of Integers (without duplicates):");
        System.out.println(removeDuplicates(myNumbersCollection));

    }

    public static <T> Collection<T> removeDuplicates(Collection<T> aCollection) {
        return new HashSet<>(aCollection);
    }

}
