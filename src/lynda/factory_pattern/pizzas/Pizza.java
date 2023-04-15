package lynda.pizzas;

import java.util.ArrayList;

/**
 * Created by aditya on 3/1/17.
 */
abstract public class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing : " + name);
    }

    public void bake() {
        System.out.println("Baking : " + name);
    }

    public void cut() {
        System.out.println("Cutting : " + name);
    }

    public void box() {
        System.out.println("Boxing : " + name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();

        display.append("----" + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");

        for (int i = 0; i < toppings.size(); i++) {
            display.append(toppings.get(i) + "\n");
        }

        return display.toString();
    }
}
