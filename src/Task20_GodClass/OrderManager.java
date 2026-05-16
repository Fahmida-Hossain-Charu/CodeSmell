// Scenario:
// The `OrderManager` class is responsible for too many tasks — from order creation to shipping,
// payment processing, and email notification. If a bug occurs in the `createOrder()` method,
// there’s a risk that it might inadvertently affect other methods like `processPayment()` or `shipOrder()`.
// As the system grows, maintaining and testing this class will become increasingly difficult.
//
// Task for Students:
// Refactor the `OrderManager` class by extracting responsibility into separate classes
// (e.g., `PaymentProcessor`, `ShippingService`, `EmailService`, etc.).
// Apply the Extract Class refactoring technique.
package Task20_GodClass;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<Order> orders = new ArrayList<>();

    private PaymentService paymentService =
            new PaymentService();

    private ShippingService shippingService =
            new ShippingService();

    private EmailService emailService =
            new EmailService();

    private InvoiceService invoiceService =
            new InvoiceService();

    public void createOrder(Order order) {

        orders.add(order);
    }

    public void processPayment(Order order) {

        paymentService.processPayment(order);
    }

    public void shipOrder(Order order) {

        shippingService.shipOrder(order);
    }

    public void sendConfirmationEmail(Order order) {

        emailService.sendConfirmationEmail(order);
    }

    public void calculateInvoice(Order order) {

        invoiceService.calculateInvoice(order);
    }
}