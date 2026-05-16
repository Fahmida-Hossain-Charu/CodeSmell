// Scenario:
// The logic for calculating and printing invoice totals is duplicated across two classes (`InvoiceService` and `ReceiptService`).
// If you need to change the tax rate or formatting, you'll need to update it in both places, risking inconsistencies.
//
// Task for Students:
// Refactor the code to extract the duplicated logic into a shared method or utility class.
// Apply Extract Method and Pull Up Method (or use composition via a helper class) to eliminate redundancy.
package Task07_DuplicateCode;

public class InvoiceService {

    private OrderCalculator calculator = new OrderCalculator();

    public void printInvoice(Order order) {

        double finalTotal = calculator.calculateTotalWithTax(order);

        System.out.println("Invoice Total: " + finalTotal);
    }
}
