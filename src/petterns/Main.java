package petterns;

import patterns.strategy.*;
import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.fly.FlyRocketBehavior;

public class Main {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketBehavior());
        duck.performFly();

    }
}
