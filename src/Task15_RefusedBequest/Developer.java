package Task15_RefusedBequest;

public class Developer {

    private String name;

    private String programmingLanguage;


    private SalaryManager salaryManager;

    public Developer(String name,
                     String programmingLanguage,
                     int salary) {

        this.name = name;
        this.programmingLanguage = programmingLanguage;

        this.salaryManager =
                new SalaryManager(salary);
    }

    public void giveRaise(int raiseAmount) {
        salaryManager.giveRaise(raiseAmount);
    }

    public int getSalary() {
        return salaryManager.getSalary();
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}