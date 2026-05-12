package Task22_LongParameterList;

public class Main {

    public static void main(String[] args) {

        Customer customer =
                new Customer(
                        "Lee Know",
                        "Seoul",
                        "12345"
                );

        Product product =
                new Product(
                        "Album",
                        2,
                        100
                );

        PaymentDetails payment =
                new PaymentDetails("Card");

        ShippingDetails shipping =
                new ShippingDetails("Express");

        OrderProcessor processor =
                new OrderProcessor();

        processor.processOrder(
                customer,
                product,
                payment,
                shipping,
                10.0
        );
    }
}