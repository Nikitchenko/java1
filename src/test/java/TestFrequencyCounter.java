import org.junit.jupiter.api.Test;
import task.four.FrequencyCounter;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFrequencyCounter {
    @Test
    public void testCountCharFrequency() {
        String testTtext = "abraCadabra";
        HashMap<String, Integer> testFrequencyDictionary = new HashMap<String, Integer>() {{
            put("a", 5);
            put("b", 2);
            put("r", 2);
            put("C", 1);
            put("d", 1);
        }};

        assertEquals(testFrequencyDictionary, FrequencyCounter.countCharFrequency(testTtext), "chars counted incorrectly");
    }
}
