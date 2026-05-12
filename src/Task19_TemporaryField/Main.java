package Task19_TemporaryField;

public class Main {

    public static void main(String[] args) {

        Employee employee =
                new Employee(
                        "Felix",
                        50000
                );

        employee.giveRaise(5000);

        System.out.println(
                employee.getName()
                        + " New Salary: "
                        + employee.getSalary()
        );
    }
}