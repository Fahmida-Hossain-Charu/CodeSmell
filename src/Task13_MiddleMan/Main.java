package Task13_MiddleMan;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Fahmida",
                "fahmida@gmail.com"
        );


        System.out.println("Name: " + customer.getName());

        System.out.println("Email: " + customer.getEmail());
    }
}