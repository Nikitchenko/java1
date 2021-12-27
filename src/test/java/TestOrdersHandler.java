import collections.OrdersHandler;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class TestOrdersHandler {
    String[] myTestOrders = {"orderNumber: 001", "orderNumber: 002", "orderNumber: 003", "orderNumber: 001", "orderNumber: 005"};

    @Test
    public void testConvertArrayToHashSet() {
        String[] myTestOrders1 = {"orderNumber: 003", "orderNumber: 001", "orderNumber: 002", "orderNumber: 005"};
        HashSet<String> mySet = new HashSet<>(Arrays.asList(myTestOrders1));

        assertTrue(mySet.equals(OrdersHandler.convertArrayToHashSet(myTestOrders)), "Sets are not equal.");
    }

    @Test
    public void testConvertArrayToTreeSet() {
        String[] myTestOrders2 = {"orderNumber: 001", "orderNumber: 002", "orderNumber: 003", "orderNumber: 005"};

        assertArrayEquals(myTestOrders2, OrdersHandler.convertArrayToTreeSet(myTestOrders).toArray(), "Arrays are not equal.");
    }
}
