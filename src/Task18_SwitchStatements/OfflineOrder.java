package Task18_SwitchStatements;

public class OfflineOrder extends Order {

    @Override
    public void processOrder() {

        System.out.println(
                "Processing offline order"
        );
    }
}