package Task23_PrimitiveObsession;

public class Money {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void add(int value) {
        this.amount += value;
    }
}