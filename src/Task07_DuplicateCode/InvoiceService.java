package Task07_DuplicateCode;

public class InvoiceService {

    private OrderCalculator calculator = new OrderCalculator();

    public void printInvoice(Order order) {

        double finalTotal = calculator.calculateTotalWithTax(order);

        System.out.println("Invoice Total: " + finalTotal);
    }
}
