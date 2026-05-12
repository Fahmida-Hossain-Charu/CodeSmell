package Task10_IncompleteLibraryClass;


import java.time.LocalDate;
import java.time.Period;

public class DateUtils {

    // foreign method introduced here
    public static int calculateAge(LocalDate birthDate) {

        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}