// Scenario:
// The code accesses multiple objects in a chain (e.g., `order.getCustomer().getAddress().getZipCode()`).
// This makes the code fragile — any change in the structure requires updates in many places.
//
// Task for Students:
// Refactor the code to hide the internal structure by adding delegation methods in the parent classes.
// Apply **Hide Delegate** or **Move Method** to simplify calls.

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