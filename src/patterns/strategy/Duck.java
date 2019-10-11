package patterns.strategy;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.quack.QuckBehavior;

public abstract class Duck {
    public void swim(){
        System.out.println("Утка плавает");
    }

    FlyBehavior flyBehavior;
    QuckBehavior quckBehavior;

    public void performQuack(){
        quckBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public abstract void display();

    public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior (QuckBehavior qb){
        quckBehavior = qb;
    }

}
