import collections.MapCreator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMapCreator {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    List<String> myTestStrings = Arrays.asList("foo", "bar", "delta");
    List<Integer> myTestNumbers = Arrays.asList(1, 2, 3, 4);
    TreeMap<String, Integer> testMapKV_1 = new TreeMap<String, Integer>() {{
        put("foo", 1);
        put("bar", 2);
        put("delta", 3);
    }};

    @Test
    public void testCreateMapOption1Case1() {
        //Option 1, K < V
        assertEquals(testMapKV_1, MapCreator.createMapOption1(myTestStrings, myTestNumbers), "Maps are not equal.");
    }

    @Test
    public void testCreateMapOption1Case2() {
        TreeMap<Integer, String> testMapKV1_2 = new TreeMap<Integer, String>() {{
            put(1, "foo");
            put(2, "bar");
            put(3, "delta");
            put(4, null);
        }};
        //Option 1, K > V
        assertEquals(testMapKV1_2, MapCreator.createMapOption1(myTestNumbers, myTestStrings), "Maps are not equal.");
    }

    @Test
    public void testCreateMapOption2Case1() {
        //Option 2, K < V
        assertEquals(testMapKV_1, MapCreator.createMapOption2(myTestStrings, myTestNumbers), "Maps are not equal.");
    }

    @Test
    public void testCreateMapOption2Case2() {
        TreeMap<Integer, String> testMapKV2_2 = new TreeMap<Integer, String>() {{
            put(1, "foo");
            put(2, "bar");
            put(3, "delta");
        }};
        //Option 2, K > V
        assertEquals(testMapKV2_2, MapCreator.createMapOption2(myTestNumbers, myTestStrings), "Maps are not equal.");
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testMessageInConsoleOption2Case1() {
        //Option 2, K < V
        MapCreator.createMapOption2(myTestStrings, myTestNumbers);
        assertEquals("Key is not enough for map.\nThere are 1 extra values.", outputStreamCaptor.toString()
                .trim(), "Message is incorrect or not displayed.");
    }

    @Test
    void testMessageInConsoleOption2Case2() {
        //Option 2, K > V
        MapCreator.createMapOption2(myTestNumbers, myTestStrings);
        assertEquals("Value is not enough for map.", outputStreamCaptor.toString()
                .trim(), "Message is incorrect or not displayed.");
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
