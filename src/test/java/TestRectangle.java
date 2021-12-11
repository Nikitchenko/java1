import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {

    @Test
    public void testArea() {
        Rectangle myTestRect = new Rectangle(40, 50);
        assertEquals(2000, myTestRect.area());
    }
}