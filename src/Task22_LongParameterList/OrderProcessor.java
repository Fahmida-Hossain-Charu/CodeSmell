// Scenario:
// When the `processOrder()` method is called, it's passing around a large number of parameters.
// This makes it hard to understand and use correctly, and any future changes in the way we store customer information
// or order details will require us to update every method that uses this signature. If you introduce a new property for
// `Customer`, such as `email`, every method call must be updated. This increases the risk of errors and increases the
// maintenance burden.
//
// Task for Students:
// Refactor the `processOrder()` method by grouping related parameters into appropriate objects
// (e.g., `Customer`, `Product`, `ShippingDetails`).
// Apply the Introduce Parameter Object refactoring technique.
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