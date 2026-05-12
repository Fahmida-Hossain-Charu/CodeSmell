package Task15_RefusedBequest;

public class Main {

    public static void main(String[] args) {

        Developer developer =
                new Developer(
                        "Fahmida",
                        "Java",
                        50000
                );

        developer.giveRaise(5000);

        System.out.println(
                "Developer Salary: "
                        + developer.getSalary()
        );

        Manager manager =
                new Manager(
                        "Charu",
                        10000
                );

        System.out.println(
                "Manager Bonus: "
                        + manager.getBonus()
        );
    }
}