package derekbanas.builder_pattern;


public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotTorso();

    void buildRobotArms();

    void buildRobotLegs();

    Robot getRobot();

}
