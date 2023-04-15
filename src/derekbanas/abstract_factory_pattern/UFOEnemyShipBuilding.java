package derekbanas.abstract_factory_pattern;


public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        EnemyShipFactory shipPartsFactory = null;

        switch (typeOfShip) {
            case "UFO":
                shipPartsFactory = new UFOEnemyShipFactory();
                theEnemyShip = new UFOEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Grunt Ship");
                break;
            case "UFO BOSS":
                shipPartsFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");
                break;
        }

        return theEnemyShip;
    }
}
