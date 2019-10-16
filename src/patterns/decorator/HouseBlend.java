package patterns.decorator;

public class HouseBlend extends Bevarage{

    public HouseBlend(){
        description = "Most Excellent HouseBlend";
    }
    private double cost = 1700;
    @Override
    public double cost() {

        return super.cost() + cost;
    }
}
