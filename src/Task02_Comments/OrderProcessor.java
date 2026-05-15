
package Task02_Comments;
public class OrderProcessor {

    public void processOrder(Order order) {

        if (isOrderEmpty(order)) {
            printEmptyOrderMessage();
            return;
        }

        double total = calculateTotal(order);
        double tax = calculateTax(total);

        printFinalAmount(total, tax);
    }

    private boolean isOrderEmpty(Order order) {
        return order.getItems().isEmpty();
    }

    private void printEmptyOrderMessage() {
        System.out.println("Order is empty");
    }

    private double calculateTotal(Order order) {
        double total = 0;

        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    private double calculateTax(double total) {
        return total * 0.2;
    }

    private void printFinalAmount(double total, double tax) {
        System.out.println("Total with tax: " + (total + tax));
    }
}