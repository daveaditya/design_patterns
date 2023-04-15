package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real RedHead duck");
    }
}
