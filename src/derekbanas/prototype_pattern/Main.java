package derekbanas.prototype_pattern;


public class Main {

    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clonedSally = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSally);
        System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
        System.out.println("Cloned Sally Hashcode: " + System.identityHashCode(clonedSally));
    }


}
