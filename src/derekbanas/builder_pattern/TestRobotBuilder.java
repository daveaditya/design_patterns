package derekbanas.builder_pattern;


public class TestRobotBuilder {

    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        robotEngineer.makeBot();
        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
    }

}
