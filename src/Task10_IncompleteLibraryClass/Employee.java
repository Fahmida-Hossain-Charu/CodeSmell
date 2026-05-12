package Task10_IncompleteLibraryClass;



import java.time.LocalDate;

public class Employee {

    private LocalDate birthDate;

    public Employee(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {

        // uses utility/helper method
        return DateUtils.calculateAge(birthDate);
    }
}
