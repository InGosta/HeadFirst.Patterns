package patterns;

import patterns.strategy.*;
import patterns.strategy.fly.FlyRocketBehavior;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        duck.setFlyBehavior(new FlyRocketBehavior());
        duck.performFly();

    }
}
