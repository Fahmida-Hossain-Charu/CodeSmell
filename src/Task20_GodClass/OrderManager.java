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