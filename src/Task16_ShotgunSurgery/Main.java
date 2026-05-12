package Task16_ShotgunSurgery;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("Album");

        Item item2 = new Item("Lightstick");

        Order order =
                new Order(
                        "Bang Chan",
                        Arrays.asList(item1, item2)
                );

        OrderValidator validator =
                new OrderValidator();

        PaymentProcessor paymentProcessor =
                new PaymentProcessor();

        ShippingHandler shippingHandler =
                new ShippingHandler();

        validator.validateOrder(order);

        paymentProcessor.processPayment(order);

        shippingHandler.shipOrder(order);
    }
}