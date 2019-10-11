package patterns.strategy;

import patterns.strategy.fly.FlyNoWay;
import patterns.strategy.quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quckBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Я фигурка утки");
    }
}
