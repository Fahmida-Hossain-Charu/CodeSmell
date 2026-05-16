// Scenario:
// Java's `LocalDate` class doesn't have a method to calculate age directly from a birth date.
// Since we can’t modify the library class, the logic ends up scattered throughout the code.
//
// Task for Students:
// Create a utility/helper class with a well-named method to encapsulate the missing functionality.
// Apply **Introduce Foreign Method** or **Introduce Extension Method** (in languages that support it).

package Task10_IncompleteLibraryClass;
import java.time.LocalDate;

public class Employee {

    private LocalDate birthDate;

    public Employee(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {

        return DateUtils.calculateAge(birthDate);
    }
}
