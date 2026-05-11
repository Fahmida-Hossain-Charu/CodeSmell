package Task6_DivergentChange;

public class Employee {
    private String name;
    private int salary;
    private double taxRate;

    public Employee(String name, int salary, double taxRate) {
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTaxRate() {
        return taxRate;
    }
}