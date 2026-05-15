package Task08_FeatureEnvy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LineItem item1 = new LineItem(100);
        LineItem item2 = new LineItem(200);

        Invoice invoice = new Invoice(Arrays.asList(item1, item2));

        InvoicePrinter printer = new InvoicePrinter();

        printer.printInvoice(invoice);
    }
}
