package Task16_ShotgunSurgery;

public class PaymentProcessor {

    public void processPayment(Order order) {

        System.out.println(
                "Processing payment for "
                        + order.getCustomerName()
        );
    }
}