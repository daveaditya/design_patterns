package telusko.composite_pattern;


public class Leaf implements Component {

    private String name;
    private int price;

    public Leaf(String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }

}
