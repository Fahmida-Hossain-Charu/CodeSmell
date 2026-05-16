// Scenario:
// The `Employee` class holds several pieces of related data (name, address, phone number, department, salary),
// and this data is passed around in various parts of the codebase. Whenever an employee is updated,
// all of these pieces of data are passed together. If, in the future, the company needs to store a new set of
// related information (e.g., `ContactInfo`), the existing structure will quickly become cumbersome and hard to maintain.
//
// Task for Students:
// Refactor the `Employee` class by extracting the data clumps into appropriate classes
// (e.g., create a `ContactInfo` class for the address and phone number).
// Apply the Extract Class refactoring technique.
package Task04_DataClump;

public class Employee {

    private String name;
    private ContactInfo contactInfo;
    private String department;
    private int salary;

    public Employee(String name, ContactInfo contactInfo, String department, int salary) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.department = department;
        this.salary = salary;
    }

    public void updateEmployee(String name, ContactInfo contactInfo,
                               String department, int salary) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.department = department;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}