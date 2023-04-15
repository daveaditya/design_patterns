package lynda.strategy_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        ModelDuck modelDuck = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
