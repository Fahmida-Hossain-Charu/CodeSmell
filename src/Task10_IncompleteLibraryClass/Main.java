package Task10_IncompleteLibraryClass;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
                LocalDate.of(2003, 5, 10)
        );

        System.out.println("Age: " + employee.getAge());
    }
}
