package Task20_GodClass;

public class InvoiceService {

    public void calculateInvoice(Order order) {

        double total = 0;

        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        System.out.println(
                "Total for Order: " + total
        );
    }
}