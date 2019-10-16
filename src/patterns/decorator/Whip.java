package patterns.decorator;

public class Whip extends CondimentDecorator {
    Bevarage bevarage;

    double cost = 30;
    public Whip(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return bevarage.cost() + cost;
    }
}
