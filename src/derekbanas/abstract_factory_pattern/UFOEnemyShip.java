package derekbanas.abstract_factory_pattern;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory enemyShipFactory) {

        this.shipFactory = enemyShipFactory;

    }

    void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
