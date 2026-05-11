
package Task1_AltClassWithDiffInt;


public class Main {
    public static void main(String[] args) {

        Order online = new OnlineOrder();
        Order offline = new OfflineOrder();

        online.processPayment(500);
        offline.processPayment(300);
    }
}