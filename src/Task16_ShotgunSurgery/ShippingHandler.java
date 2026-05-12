package Task16_ShotgunSurgery;

public class ShippingHandler {

    public void shipOrder(Order order) {

        System.out.println(
                "Shipping order for "
                        + order.getCustomerName()
        );
    }
}