import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask3 {

    String s1 = String.valueOf(125);
    String s2 = String.valueOf(24);

    @Test
    public void testAddValues() {
        assertEquals(149, (int) Task3.addValues(s1, s2));
    }

    @Test
    public void testSubtractValues() {
        assertEquals(101, (int) Task3.subtractValues(s1, s2));
    }
    @Test
    public void testMultiplyValues() {
        assertEquals(3000, (int) Task3.multiplyValues(s1, s2));
    }
    @Test
    public void testDivideValues() {
        assertEquals(5, (int) Task3.divideValues(s1, s2));
    }
    @Test
    public void testRemindValues() {
        assertEquals(5, (int) Task3.remindValues(s1, s2));
    }
}
