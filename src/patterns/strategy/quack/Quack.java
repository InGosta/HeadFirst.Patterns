package patterns.strategy.quack;

public class Quack implements QuckBehavior {
    @Override
    public void quack() {
        System.out.println("Утка крякает");
    }
}
