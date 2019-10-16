package patterns.decorator;

public class HouseBlend extends Bevarage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }
    private double cost = 200;
    @Override
    public double cost() {

        return cost;
    }
}
