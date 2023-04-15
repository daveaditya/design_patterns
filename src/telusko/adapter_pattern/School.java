package adapter_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class School {

    public static void main(String[] args) {


//        PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I'm a bit tired to write the assignment");
    }

}
