package Task14_ParallelInheritanceHierarchy;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Fahmida", 50000);

        manager.assignBonus(10000);

        System.out.println(
                manager.getName() +
                        " Bonus: " +
                        manager.getBonus()
        );

        ContractorManager contractorManager =
                new ContractorManager("Charu", 1000);

        contractorManager.assignBonus(5000);

        System.out.println(
                contractorManager.getName() +
                        " Bonus: " +
                        contractorManager.getBonus()
        );
    }
}