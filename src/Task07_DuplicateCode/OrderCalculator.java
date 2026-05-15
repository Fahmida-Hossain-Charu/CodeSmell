package Task07_DuplicateCode;

public class OrderCalculator {

    public double calculateTotalWithTax(Order order) {

        double total = 0;

        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        double tax = total * 0.2;

        return total + tax;
    }
}
