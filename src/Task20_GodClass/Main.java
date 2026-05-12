package Task20_GodClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item(100);
        Item item2 = new Item(200);

        Order order = new Order(Arrays.asList(item1, item2));

        OrderManager manager = new OrderManager();
        manager.createOrder(order);
        manager.processPayment(order);
        manager.shipOrder(order);
        manager.sendConfirmationEmail(order);
        manager.calculateInvoice(order);
    }
}