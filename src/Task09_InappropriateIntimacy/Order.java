// Scenario:
// The `OrderHelper` class accesses and modifies internal fields of the `Order` class directly.
// This makes `OrderHelper` too familiar with the internals of `Order`, violating encapsulation.
//
// Task for Students:
// Refactor the code to reduce coupling by using public methods in `Order` instead of accessing fields directly.
// Apply **Encapsulate Field**, **Move Method**, or **Hide Delegate** as needed.

package Task09_InappropriateIntimacy;
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
