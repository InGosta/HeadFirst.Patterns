package patterns.decorator;

public class Espresso extends Bevarage {

    public Espresso(){
        description = "Most Excellent Espresso";
    }
    private double cost = 1700;
    @Override
    public double cost() {

        return super.cost() + cost;
    }
}
