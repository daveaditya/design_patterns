package derekbanas.strategy_pattern;



public class Bird extends Animal {

    public Bird() {

        super();
        setSound("Tweet");
        setFlyingAbility(new ItFlys());

    }

}
