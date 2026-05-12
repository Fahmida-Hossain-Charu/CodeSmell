package Task23_PrimitiveObsession;

public class Main {

    public static void main(String[] args) {

        Employee employee =
                new Employee(
                        "Suga",
                        new Money(50000),
                        new HireDate(2022, 5, 10)
                );

        employee.giveRaise(5000);

        System.out.println(
                "Employee: "
                        + employee.getName()
        );

        System.out.println(
                "Salary: "
                        + employee.getSalary().getAmount()
        );

        System.out.println(
                "Hire Year: "
                        + employee.getHireDate().getYear()
        );
    }
}