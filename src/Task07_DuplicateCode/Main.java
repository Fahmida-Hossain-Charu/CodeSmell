package Task07_DuplicateCode;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item(100);
        Item item2 = new Item(200);

        Order order = new Order(Arrays.asList(item1, item2));

        InvoiceService invoiceService = new InvoiceService();
        ReceiptService receiptService = new ReceiptService();

        invoiceService.printInvoice(order);
        receiptService.printReceipt(order);
    }
}
