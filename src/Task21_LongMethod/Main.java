package Task21_LongMethod;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("Book", 100);
        Item item2 = new Item("Pen", 50);

        Order order = new Order(
                101,
                Arrays.asList(item1, item2)
        );

        InvoiceGenerator generator =
                new InvoiceGenerator();

        generator.generateInvoice(order);
    }
}