package patterns.strategy.quack;

public class MuteQuack implements QuckBehavior {
    @Override
    public void quack() {
        //Не крякают
    }
}
