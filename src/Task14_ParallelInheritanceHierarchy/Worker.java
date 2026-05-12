package Task14_ParallelInheritanceHierarchy;

public abstract class Worker {

    protected String name;

    protected int bonus;

    public Worker(String name) {
        this.name = name;
    }

    // common behavior
    public void assignBonus(int bonusAmount) {
        this.bonus = bonusAmount;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }
}