package patterns.decorator;

public class Milk extends CondimentDecorator {
    Bevarage bevarage;

    double cost = 15;
    public Milk(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return bevarage.cost() + cost;
    }
}
