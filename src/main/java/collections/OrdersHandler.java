package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdersHandler {

    public static void main(String[] args) {

        System.out.println("\nTHE ORDERS:");
        String[] myOrders = {"orderNumber: 001, productID: 123, price: 123, productQuantity: 1, totalAmount 123, customerID: 001",
                "orderNumber: 002, productID: 222, price: 20, productQuantity: 2, totalAmount 40, customerID: 002",
                "orderNumber: 003, productID: 33, price: 3, productQuantity: 3, totalAmount 9, customerID: 003",
                "orderNumber: 001, productID: 123, price: 123, productQuantity: 1, totalAmount 123, customerID: 001",
                "orderNumber: 005, productID: 5, price: 5, productQuantity: 5, totalAmount 25, customerID: 005"};

        for (String order : myOrders) {
            System.out.print(order + '\n');
        }

        System.out.println("\n\"HashSet\" orders");
        for (Object s : convertArrayToHashSet(myOrders)) {
            System.out.println(s);
        }
        
        System.out.println("\n\"TreeSet\" orders");
        for (Object s : convertArrayToTreeSet(myOrders)) {
            System.out.println(s);
        }

    }

    public static Set convertArrayToHashSet(String[] ordersArray) {
        HashSet<String> ordersHashSet = new HashSet<String>();

        for (String s : ordersArray) {
            ordersHashSet.add(s);
        }
        return ordersHashSet;
    }

    public static Set convertArrayToTreeSet(String[] ordersArray) {
        TreeSet<String> ordersTreeSet = new TreeSet<String>();

        for (String s : ordersArray) {
            ordersTreeSet.add(s);
        }
        return ordersTreeSet;
    }

}
