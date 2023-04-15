package derekbanas.factory_pattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        switch (newShipType) {
            case "U":
            case "u":
                return new UFOEnemyShip();
            case "R":
            case "r":
                return new RocketEnemyShip();
            case "B":
            case "b":
                return new BigUFOEnemyShip();
            default:
                return null;
        }

    }

}
