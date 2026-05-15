package Task01_AltClassWithDiffInt;

public class OfflineOrder implements Order {
    private String customerName;
    private String orderDetails;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing offline payment of amount: " + amount);
    }
}