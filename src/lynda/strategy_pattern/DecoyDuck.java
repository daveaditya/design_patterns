package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm a decoy duck");
    }
}
