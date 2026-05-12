package Task14_ParallelInheritanceHierarchy;

public class Contractor extends Worker {

    private int hourlyRate;

    public Contractor(String name, int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    public void increaseHourlyRate(int increment) {
        hourlyRate += increment;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}