package Task12_MessageChain;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("1206");

        Customer customer = new Customer(address);

        Order order = new Order(customer);


        String zip = order.getCustomerZipCode();

        System.out.println("Zip Code: " + zip);
    }
}