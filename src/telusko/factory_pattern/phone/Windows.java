package factory_pattern.phone;

/**
 * Created by aditya on 3/1/17.
 */
public class Windows implements OS {

    @Override
    public void spec() {
        System.out.println("Windows inside...");
    }
}
