package Task12_MessageChain;

public class Order {

    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerZipCode() {
        return customer.getZipCode();
    }
}