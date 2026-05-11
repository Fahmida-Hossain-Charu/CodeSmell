package Task6_DivergentChange;
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Fahmida", 50000, 0.1);

        SalaryManager salaryManager = new SalaryManager();
        TaxCalculator taxCalculator = new TaxCalculator();

        salaryManager.applyRaise(emp, 5000);

        double tax = taxCalculator.calculateTax(emp);

        System.out.println("Updated Salary: " + emp.getSalary());
        System.out.println("Tax: " + tax);
    }
}