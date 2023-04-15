package adapter_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class AssignmentWork {

    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str) {
        p.write(str);
    }

}
