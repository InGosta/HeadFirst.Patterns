package patterns.strategy;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quack.QuckBehavior;
import patterns.strategy.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck (){
        quckBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }


    @Override
    public void display() {
        System.out.println("Я резинова утка");
    }



}
