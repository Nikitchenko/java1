
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunitIntegrationTest {
    @Test
    public void testLucky() {
        assertEquals(7, JunitIntegrationTest.getLucky());
    }

}
