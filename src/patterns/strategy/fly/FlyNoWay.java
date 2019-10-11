package patterns.strategy.fly;

import patterns.strategy.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Утка не летает");
    }
}
