package patterns.decorator;

public class Mocha extends CondimentDecorator {
    Bevarage bevarage;

    double cost = 50;
    public Mocha(Bevarage bevarage)
    {
       this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return bevarage.cost() + cost;
    }
}
