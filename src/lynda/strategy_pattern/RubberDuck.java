package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
