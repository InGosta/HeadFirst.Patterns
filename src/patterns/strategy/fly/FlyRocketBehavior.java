package patterns.strategy.fly;

public class FlyRocketBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Лечу на ракете");
    }
}
