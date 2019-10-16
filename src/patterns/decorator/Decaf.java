package patterns.decorator;

public class Decaf extends Bevarage {
    public Decaf(){
        description = "Decaf";
    }
    private double cost = 100;
    @Override
    public double cost() {

        return cost;
    }
}
