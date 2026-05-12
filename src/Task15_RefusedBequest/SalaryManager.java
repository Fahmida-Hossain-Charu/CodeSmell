package Task15_RefusedBequest;

public class SalaryManager {

    private int salary;

    public SalaryManager(int salary) {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void giveRaise(int raiseAmount) {
        salary += raiseAmount;
    }

    public int getSalary() {
        return salary;
    }
}