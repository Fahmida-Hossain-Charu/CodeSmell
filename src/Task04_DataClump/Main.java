package Task04_DataClump;

public class Main {
    public static void main(String[] args) {

        ContactInfo contact = new ContactInfo(
                "Dhaka, Bangladesh",
                "017XXXXXXXX"
        );

        Employee emp = new Employee(
                "Fahmida",
                contact,
                "Software Engineering",
                50000
        );

        System.out.println("Employee: " + emp.getName());
        System.out.println("Address: " + emp.getContactInfo().getAddress());
        System.out.println("Phone: " + emp.getContactInfo().getPhoneNumber());
    }
}
