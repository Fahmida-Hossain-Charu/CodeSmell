// Scenario:
// The class contains a method `printDebugInfo()` that is no longer used anywhere in the codebase.
// Dead code like this increases cognitive load and makes the system harder to understand.
//
// Task for Students:
// Identify and safely remove any unused code from the class. Use your IDE or static analysis tools
// to ensure the method isn’t referenced elsewhere.
// Apply the **Remove Dead Code** refactoring technique.
package Task05_DeadCode;
public class PaymentService {

    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}
