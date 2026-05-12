package Task18_SwitchStatements;

public class Main {

    public static void main(String[] args) {

        Order onlineOrder =
                new OnlineOrder();

        Order offlineOrder =
                new OfflineOrder();

        Order specialOrder =
                new SpecialOrder();

        onlineOrder.processOrder();

        offlineOrder.processOrder();

        specialOrder.processOrder();
    }
}