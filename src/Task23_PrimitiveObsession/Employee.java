// Scenario:
// The Employee class uses primitive types like int and String for complex concepts
// like salary and hire date. The salary is just an int representing cents,
// and the hire date is a simple string. Over time, as new features are added
// (like currency conversion or date-based queries), this will cause confusion
// and errors. Additionally, it makes the system difficult to extend or
// maintain, as logic related to salary or date could be scattered all over the application.

// Task for Students:
// Refactor the Employee class by introducing proper value objects, like a Money class for salary and a Date class for hire date.
// Apply the Replace Primitive with Object refactoring technique.
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