package patterns.strategy;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quack.Quack;
import patterns.strategy.quack.QuckBehavior;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quckBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Я красноголовая утка");
    }





}
