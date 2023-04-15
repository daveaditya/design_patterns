package telusko.composite_pattern;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String name;
    private List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public void removeComponent(int componentIndex) {
        componentList.remove(componentIndex);
    }


    @Override
    public void showPrice() {

        System.out.println("\n" + name + "\n");
        for (Component component : componentList) {
            component.showPrice();
        }

    }

}
