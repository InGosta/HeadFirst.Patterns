package patterns.decorator;

public class DarkRoast extends Bevarage {
    public DarkRoast(){
      description = "Most Excellent Dark Roast";
    }
    private double cost = 1000;
    @Override
    public double cost() {

        return cost;
    }
}
