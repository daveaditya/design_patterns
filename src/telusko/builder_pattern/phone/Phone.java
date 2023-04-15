package builder_pattern.phone;

/**
 * Created by aditya on 3/1/17.
 */
public class Phone {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;


    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone [ OS : " + os + " , RAM : " + ram + " , Processor : "
                + " , Screen Size : " + screenSize + " , Battery : " + battery
                + " ]";
    }
}
