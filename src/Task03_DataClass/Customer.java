// Scenario:
// This `Customer` class only contains fields and getters/setters, but no behavior. It's just a passive data holder,
// making it vulnerable to misuse. Business logic related to the customer ends up scattered elsewhere,
// violating encapsulation.
//
// Task for Students:
// Refactor the class by moving related logic (e.g., full name formatting, validation) into the `Customer` class
// so that it encapsulates its behavior.
// Apply the **Encapsulate Field** and **Move Method** refactoring techniques
package Task03_DataClass;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be empty");
        }
        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }



    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isValidCustomer() {
        return email != null && email.contains("@");
    }
}
