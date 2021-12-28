import collections.ChangerMapKV;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChangerMapKV {

    TreeMap<String, Integer> testMapOriginal = new TreeMap<String, Integer>() {{
        put("C", 1);
        put("a", 5);
        put("b", 2);
        put("d", 1);
        put("r", 2);
    }};

    @Test
    public void testReverseMap() {
        HashMap<Integer, String> testMapReversed = new HashMap<Integer, String>() {{
            put(5, "a");
            put(1, "d");
            put(2, "r");
        }};
        assertEquals(testMapReversed, ChangerMapKV.reverseMap(testMapOriginal), "Keys and values reversed incorrectly.");
    }

    @Test
    public void testSwapMap() {
        Set<String> aset1 = new HashSet<>(Arrays.asList("C", "d"));
        Set<String> aset2 = new HashSet<>(Arrays.asList("b", "r"));
        Set<String> aset3 = new HashSet<>(Arrays.asList("a"));
        HashMap<Integer, Set<String>> testMapSwapped = new HashMap<Integer, Set<String>>() {{
            put(1, aset1);
            put(2, aset2);
            put(5, aset3);
        }};

        assertEquals(testMapSwapped, ChangerMapKV.swapKeysToValues(testMapOriginal), "Keys and values swapped incorrectly.");
    }

}
