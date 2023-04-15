package derekbanas.strategy_pattern;

public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole.");
    }

    public Dog() {
        super();
        setSound("Bark");
        setFlyingAbility(new CantFly());
    }

}
