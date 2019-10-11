package patterns.strategy.quack;

public class Squeak implements QuckBehavior {
    @Override
    public void quack() {
        System.out.println("Утка писщит");
    }
}
