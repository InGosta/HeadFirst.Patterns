package patterns.decorator;

public class Espresso extends Bevarage {

    public Espresso(){
        description = "Espresso";
    }
    private double cost = 300;
    @Override
    public double cost() {

        return cost;
    }
}
