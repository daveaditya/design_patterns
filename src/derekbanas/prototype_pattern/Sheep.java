package derekbanas.prototype_pattern;


public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made.");
    }


    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made.");
        Sheep sheepObj = null;

        try {
            sheepObj = (Sheep) super.clone();
        } catch (CloneNotSupportedException exc) {
            exc.printStackTrace();
        }

        return sheepObj;
    }

    @Override
    public String toString() {
        return "Dolly, is my hero";
    }
}
