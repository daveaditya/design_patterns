package factory_pattern;

import factory_pattern.phone.*;

/**
 * Created by aditya on 3/1/17.
 */
public class FactoryMain {

    public static void main(String[] args) {

        OS obj = OperatingSystemFactory.getInstance("Open");
        System.out.println();
        obj.spec();
    }

}
