package patterns.strategy.fly;

import patterns.strategy.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
