package Task07_DuplicateCode;

public class ReceiptService {

    private OrderCalculator calculator = new OrderCalculator();

    public void printReceipt(Order order) {

        double finalTotal = calculator.calculateTotalWithTax(order);

        System.out.println("Receipt Total: " + finalTotal);
    }
}
