package Task12_MessageChain;

public class Customer {

    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public String getZipCode() {
        return address.getZipCode();
    }
}