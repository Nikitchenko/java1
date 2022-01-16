import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask3 {

    double d1 = 125.00d;
    double d2 = 24.00d;

    @Test
    public void testAddValues() {
        assertEquals(149, (int) Task3.addValues(d1, d2));
    }

    @Test
    public void testSubtractValues() {
        assertEquals(101, (int) Task3.subtractValues(d1, d2));
    }

    @Test
    public void testMultiplyValues() {
        assertEquals(3000, (int) Task3.multiplyValues(d1, d2));
    }

    @Test
    public void testDivideValues() {
        assertEquals(5, (int) Task3.divideValues(d1, d2));
    }

    @Test
    public void testRemindValues() {
        assertEquals(5, (int) Task3.remindValues(d1, d2));
    }
}
