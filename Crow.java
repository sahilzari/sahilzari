package inheritance;

public class Crow extends Animal {
    private boolean canFly;

    public Crow(boolean vegetarian, String eats, int noOfLegs, boolean canFly) {
        super(vegetarian, eats, noOfLegs);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
