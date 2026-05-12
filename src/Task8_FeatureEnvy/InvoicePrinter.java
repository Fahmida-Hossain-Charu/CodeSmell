package Task8_FeatureEnvy;

public class InvoicePrinter {

    public void printInvoice(Invoice invoice) {

        System.out.println("Subtotal: " + invoice.calculateSubtotal());

        System.out.println("Tax: " + invoice.calculateTax());

        System.out.println("Total: " + invoice.calculateTotal());
    }
}
