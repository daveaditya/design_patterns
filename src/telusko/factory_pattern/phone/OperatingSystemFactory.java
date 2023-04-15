package factory_pattern.phone;

/**
 * Created by aditya on 3/1/17.
 */
public class OperatingSystemFactory {

    public static OS getInstance(String osType) {
        if (osType.equals("Open")) {
            return new Android();
        }
        else if(osType.equals("Closed")) {
            return new IOS();
        }
        else {
            return new Windows();
        }
    }

}
