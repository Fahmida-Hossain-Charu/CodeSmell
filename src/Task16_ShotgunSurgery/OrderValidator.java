package Task16_ShotgunSurgery;

public class OrderValidator {

    public void validateOrder(Order order) {

        System.out.println(
                "Validating order for "
                        + order.getCustomerName()
        );
    }
}