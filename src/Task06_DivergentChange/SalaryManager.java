package Task06_DivergentChange;
public class SalaryManager {

    public void applyRaise(Employee employee, int raiseAmount) {
        int newSalary = employee.getSalary() + raiseAmount;
        employee.setSalary(newSalary);
    }
}