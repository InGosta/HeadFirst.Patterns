package patterns.decorator;

public class Decaf extends Bevarage {
    public Decaf(){
        description = "Most Excellent Decaf";
    }
    private double cost = 700;
    @Override
    public double cost() {

        return super.cost() + cost;
    }
}
