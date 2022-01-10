import collections.CollectionWithoutDuplicates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCollectionWithoutDuplicates {

    @Test
    public void testRemoveDuplicates() {
        String[] myTestStringsDuplicated = {"string1", "string2", "string3", "string1", "string5"};
        Collection<String> myTestStringsCollection = Arrays.asList(myTestStringsDuplicated);
        Integer[] myTestNumbersDuplicated = {1, 2, 3, 1, 5};
        Collection<Integer> myTestNumbersCollection = Arrays.asList(myTestNumbersDuplicated);

        String[] myTestStrings = {"string1", "string2", "string3", "string5"};
        HashSet<String> mySetStrings = new HashSet<>(Arrays.asList(myTestStrings));
        Integer[] myTestNumbers = {1, 2, 3, 5};
        HashSet<Integer> mySetNumbers = new HashSet<>(Arrays.asList(myTestNumbers));

        assertEquals(mySetStrings, CollectionWithoutDuplicates.removeDuplicates(myTestStringsCollection), "Collections are not equal.");
        assertEquals(mySetNumbers, CollectionWithoutDuplicates.removeDuplicates(myTestNumbersCollection), "Collections are not equal.");
    }

}
