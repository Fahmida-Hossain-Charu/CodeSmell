// Scenario:
// You have two inheritance hierarchies: one for `Employee` and another for `Contractor`. Each hierarchy has
// its own specific classes for different roles (e.g., `Manager`, `Developer`, etc.). However, the hierarchies are
// completely parallel, which causes duplication and makes the system harder to extend.
// If you need to add a new common method to both `Employee` and `Contractor` classes, you'll need to modify both
// hierarchies, leading to redundant changes and inconsistencies.
//
// Task for Students:
// Refactor the code by extracting common behavior between `Employee` and `Contractor` into a shared superclass,
// or use interfaces to ensure that common functionality is shared between the two hierarchies.
// Apply the **Consolidate Inheritance Hierarchies** refactoring technique.

package Task14_ParallelInheritanceHierarchy;

public class Employee extends Worker {

    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void giveRaise(int raiseAmount) {
        salary += raiseAmount;
    }

    public int getSalary() {
        return salary;
    }
}