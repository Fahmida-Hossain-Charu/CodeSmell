package Task23_PrimitiveObsession;

public class Employee {

    private String name;

    private Money salary;

    private HireDate hireDate;

    public Employee(String name,
                    Money salary,
                    HireDate hireDate) {

        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Money getSalary() {
        return salary;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public String getName() {
        return name;
    }

    public void giveRaise(int amount) {
        salary.add(amount);
    }
}