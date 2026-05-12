package Task19_TemporaryField;

public class Employee {

    private String name;

    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public void giveRaise(int raiseAmount) {

        salary = salary + raiseAmount;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}