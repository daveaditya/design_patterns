package adapter_pattern;

/**
 * Created by aditya on 3/1/17.
 */
public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
