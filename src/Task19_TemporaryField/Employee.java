// Scenario:
// The `Employee` class has a temporary field `tempSalary` that is only used for salary adjustments
// during a specific operation. This temporary field causes the class to hold unnecessary state,
// which makes the class harder to understand, and might introduce bugs if it is inadvertently accessed
// in places where it shouldn’t be.
//
// Task for Students:
// Refactor the code to remove the temporary field. Instead, compute the value when needed,
// rather than storing it in the object.
// Apply the **Remove Temporary Field** refactoring technique.
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