package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new FakeQuack();
    }

    @Override
    void display() {
        System.out.println("I'm a Model Duck.");
    }
}
