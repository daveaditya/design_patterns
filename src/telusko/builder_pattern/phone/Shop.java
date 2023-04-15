package builder_pattern.phone;

/**
 * Created by aditya on 3/1/17.
 */
public class Shop {

    public static void main(String[] args) {

//        Phone p=  new Phone("Android", 2, "Qualcomm", 5.5, 3200);


        Phone p  = new PhoneBuilder().setOs("Android")
                        .setRam(2).setBattery(3000).getPhone();
        System.out.println(p);

    }

}
