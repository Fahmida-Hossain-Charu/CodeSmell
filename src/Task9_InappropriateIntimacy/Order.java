package Task9_InappropriateIntimacy;



import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Item> items = new ArrayList<>();

    private double discount = 0.0;

    public void addItem(Item item) {
        items.add(item);
    }


    public void applyDiscount(double rate) {

        double total = calculateTotal();

        discount = total * rate;
    }


    private double calculateTotal() {

        double total = 0;

        for (Item item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public double getDiscount() {
        return discount;
    }
}
