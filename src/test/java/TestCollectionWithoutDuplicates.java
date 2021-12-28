import collections.CollectionWithoutDuplicates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCollectionWithoutDuplicates {

    @Test
    public void testRemoveDuplicates() {
        String[] myTestStringsDuplicated = {"string1", "string2", "string3", "string1", "string5"};
        Integer[] myTestNumbersDuplicated = {1, 2, 3, 1, 5};
        String[] myTestStrings = {"string1", "string2", "string3", "string5"};
        HashSet<String> mySetStrings = new HashSet<>(Arrays.asList(myTestStrings));
        Integer[] myTestNumbers = {1, 2, 3, 5};
        HashSet<Integer> mySetNumbers = new HashSet<>(Arrays.asList(myTestNumbers));

        assertTrue(mySetStrings.equals(CollectionWithoutDuplicates.removeDuplicates(myTestStringsDuplicated)), "Collections are not equal.");
        assertTrue(mySetNumbers.equals(CollectionWithoutDuplicates.removeDuplicates(myTestNumbersDuplicated)), "Collections are not equal.");
    }

}
