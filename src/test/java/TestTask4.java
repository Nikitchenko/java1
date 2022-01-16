import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask4 {
    @Test
    public void testAddValues() {
        int[] myIntArray = {5,6,7,12,-5,32,43};
        assertEquals(100, Task4.sumArrayValues(myIntArray));
    }

}
