package Task9_InappropriateIntimacy;



public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        order.addItem(new Item(100));
        order.addItem(new Item(200));

        OrderHelper helper = new OrderHelper();

        helper.applyDiscount(order, 0.1);

        System.out.println("Discount: " + order.getDiscount());
    }
}
