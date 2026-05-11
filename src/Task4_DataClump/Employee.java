package Task4_DataClump;


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