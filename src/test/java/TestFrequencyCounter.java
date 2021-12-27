import org.junit.jupiter.api.Test;
import collections.FrequencyCounter;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrequencyCounter {
    @Test
    public void testCountCharFrequency() {
        String testText = "abraCadabra";
        TreeMap<String, Integer> testFrequencyDictionary = new TreeMap<String, Integer>() {{
            put("C", 1);
            put("a", 5);
            put("b", 2);
            put("d", 1);
            put("r", 2);
        }};

        assertEquals(testFrequencyDictionary, FrequencyCounter.countCharFrequency(testText), "chars counted incorrectly");
    }
}
