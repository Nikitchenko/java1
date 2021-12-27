import algorithms.OrdersHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrdersHandler {
    String[] myTestOrders = {"orderNumber: 001", "orderNumber: 002", "orderNumber: 003", "orderNumber: 001", "orderNumber: 005"};

    @Test
    public void testConvertArrayToHashSet() {
        String[] myTestOrders1 = {"orderNumber: 003", "orderNumber: 001", "orderNumber: 002", "orderNumber: 005"};

        //we do not know what exactly HashSet we will receive (order of elements), but we know that there should not be duplicates, so we know the HashSet length, check it
        assertEquals(myTestOrders1.length, OrdersHandler.convertArrayToHashSet(myTestOrders).toArray().length,
                "lengths of arrays not equal");
    }

    @Test
    public void testConvertArrayToTreeSet() {
        String[] myTestOrders2 = {"orderNumber: 001", "orderNumber: 002", "orderNumber: 003", "orderNumber: 005"};

        //we know what exactly TreeSet we expect to receive, so let's just check it
        assertArrayEquals(myTestOrders2, OrdersHandler.convertArrayToTreeSet(myTestOrders).toArray());
    }
}
