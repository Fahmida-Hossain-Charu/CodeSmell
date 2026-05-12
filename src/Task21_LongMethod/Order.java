package Task21_LongMethod;

import java.util.List;

public class Order {

    private int id;

    private List<Item> items;

    public Order(int id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }
}