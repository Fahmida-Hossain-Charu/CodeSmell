package Task21_LongMethod;

public class InvoiceGenerator {

    public void generateInvoice(Order order) {

        double total = calculateTotal(order);

        double discount = calculateDiscount(total);

        double tax = calculateTax(total);

        double finalAmount = calculateFinalAmount(total, discount, tax);

        printInvoice(order, total, discount, tax, finalAmount);
    }



    private double calculateTotal(Order order) {

        double total = 0;

        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    private double calculateDiscount(double total) {
        return total * 0.1;
    }

    private double calculateTax(double total) {
        return total * 0.2;
    }

    private double calculateFinalAmount(double total,
                                        double discount,
                                        double tax) {

        return total - discount + tax;
    }

    private void printInvoice(Order order,
                              double total,
                              double discount,
                              double tax,
                              double finalAmount) {

        System.out.println(
                "Invoice for Order ID: "
                        + order.getId()
        );

        System.out.println("Items:");

        for (Item item : order.getItems()) {

            System.out.println(
                    item.getName()
                            + ": "
                            + item.getPrice()
            );
        }

        System.out.println("Total: " + total);

        System.out.println("Discount: " + discount);

        System.out.println("Tax: " + tax);

        System.out.println("Final Amount: " + finalAmount);
    }
}