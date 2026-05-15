package Task01_AltClassWithDiffInt;

public class OnlineOrder implements Order {
    private String customerName;
    private String orderDetails;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing online payment of amount: " + amount);
    }
}