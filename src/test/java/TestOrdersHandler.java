import collections.OrdersHandler;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrdersHandler {
    String[] myTestOrders = {"orderNumber: 001", "orderNumber: 002", "orderNumber: 003", "orderNumber: 001", "orderNumber: 005"};

    @Test
    public void testConvertArrayToHashSet() {
        String[] myTestOrders1 = {"orderNumber: 003", "orderNumber: 001", "orderNumber: 002", "orderNumber: 005"};
        Set<String> mySet = new HashSet<>(Arrays.asList(myTestOrders1));

        assertEquals(mySet, OrdersHandler.convertArrayToHashSet(myTestOrders), "Sets are not equal.");
    }

    @Test
    public void testConvertArrayToTreeSet() {
        String[] myTestOrders2 = {"orderNumber: 001", "orderNumber: 002", "orderNumber: 003", "orderNumber: 005"};

        assertArrayEquals(myTestOrders2, OrdersHandler.convertArrayToTreeSet(myTestOrders).toArray(), "Arrays are not equal.");
    }
}
