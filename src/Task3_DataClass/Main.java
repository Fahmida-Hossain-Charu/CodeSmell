
package Task3_DataClass;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Fahmida",
                "Hossain",
                "fahmida@gmail.com"
        );

        System.out.println("Full Name: " + customer.getFullName());
        System.out.println("Valid Customer: " + customer.isValidCustomer());
    }
}
