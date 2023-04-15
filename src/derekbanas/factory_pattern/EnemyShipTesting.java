package derekbanas.factory_pattern;


import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        String enemyShitOption = "";

        System.out.println("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()) {
            enemyShitOption = userInput.nextLine();
        }

        theEnemy = enemyShipFactory.makeEnemyShip(enemyShitOption);
        if (theEnemy != null) {
            doStuff(theEnemy);
        } else {
            System.out.println("Wrong input");
        }
    }

    public static void doStuff(EnemyShip anEnemyShip) {

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}
