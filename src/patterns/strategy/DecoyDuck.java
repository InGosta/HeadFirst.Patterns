package patterns.strategy;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quack.MuteQuack;
import patterns.strategy.quack.QuckBehavior;

public class DecoyDuck extends Duck{
    public DecoyDuck (){
       quckBehavior = new MuteQuack();
       flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Я уткам приманка");
    }


}
