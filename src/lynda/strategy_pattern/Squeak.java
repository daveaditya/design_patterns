package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
