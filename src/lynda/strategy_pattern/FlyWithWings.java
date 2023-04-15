package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
