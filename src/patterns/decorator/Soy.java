package patterns.decorator;

public class Soy extends CondimentDecorator {
    Bevarage bevarage;

    double cost = 20;
    public Soy (Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return bevarage.cost() + cost;
    }
}
