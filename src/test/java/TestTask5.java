import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask5 {


    @Test
    public void testAddValues() {
        int[] myIntArray = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        String duplicates = "6,12";
        assertEquals(duplicates, Task5.duplicatedArrayValues(myIntArray));
    }
}
