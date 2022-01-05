import collections.ChangerMapKV;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChangerMapKV {

    Map<String, Integer> testMapOriginal = new TreeMap<String, Integer>() {{
        put("C", 1);
        put("a", 5);
        put("b", 2);
        put("d", 1);
        put("r", 2);
    }};

    @Test
    public void testReverseMap() {
        Map<Integer, String> testMapReversed = new HashMap<>();
        testMapReversed.put(5, "a");
        testMapReversed.put(1, "d");
        testMapReversed.put(2, "r");

        assertEquals(testMapReversed, ChangerMapKV.reverseMap(testMapOriginal), "Keys and values reversed incorrectly.");
    }

    @Test
    public void testSwapMap() {
        Set<String> aset1 = new HashSet<>(Arrays.asList("C", "d"));
        Set<String> aset2 = new HashSet<>(Arrays.asList("b", "r"));
        Set<String> aset3 = new HashSet<>(Arrays.asList("a"));
        Map<Integer, Set<String>> testMapSwapped = new HashMap<>();
        testMapSwapped.put(1, aset1);
        testMapSwapped.put(2, aset2);
        testMapSwapped.put(5, aset3);

        assertEquals(testMapSwapped, ChangerMapKV.swapKeysToValues(testMapOriginal), "Keys and values swapped incorrectly.");
    }

}
