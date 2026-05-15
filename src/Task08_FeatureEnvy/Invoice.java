package Task08_FeatureEnvy;

import java.util.List;

public class Invoice {

    private List<LineItem> items;

    public Invoice(List<LineItem> items) {
        this.items = items;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public double calculateSubtotal() {

        double subtotal = 0;

        for (LineItem item : items) {
            subtotal += item.getPrice();
        }

        return subtotal;
    }

    public double calculateTax() {
        return calculateSubtotal() * 0.2;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
