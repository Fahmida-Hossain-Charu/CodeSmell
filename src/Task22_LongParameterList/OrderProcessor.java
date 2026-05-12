package Task22_LongParameterList;

public class OrderProcessor {

    public void processOrder(Customer customer,
                             Product product,
                             PaymentDetails payment,
                             ShippingDetails shipping,
                             double discount) {

        System.out.println(
                "Processing order for: "
                        + customer.getName()
        );

        System.out.println(
                "Product: "
                        + product.getName()
                        + " x "
                        + product.getQuantity()
        );

        System.out.println(
                "Payment Method: "
                        + payment.getPaymentMethod()
        );

        System.out.println(
                "Shipping Method: "
                        + shipping.getShippingMethod()
        );

        System.out.println(
                "Discount: " + discount
        );
    }
}