// Scenario:
// The `AuditLogger` class was introduced to encapsulate logging logic, but it only contains one trivial method.
// Maintaining such a class adds unnecessary complexity and overhead without delivering meaningful value.
//
// Task for Students:
// Refactor the code by inlining the class or moving the method to a more appropriate existing class.
// Apply the **Inline Class** refactoring technique.
package Task11_LazyClass;
public class PaymentService {

    public void processPayment(double amount) {

        System.out.println("Processing payment: $" + amount);
        System.out.println("Audit Log: Payment completed");
    }
}
