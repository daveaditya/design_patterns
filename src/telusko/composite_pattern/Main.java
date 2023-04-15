package telusko.composite_pattern;


public class Main {

    public static void main(String[] args) {

        Component hdd = new Leaf("Hard Drive", 4000);
        Component mouse = new Leaf("Mouse", 1050);
        Component keyBoard = new Leaf("KeyBoard", 1550);
        Component monitor = new Leaf("Monitor", 7500);
        Component ram = new Leaf("RAM", 6500);
        Component cpu = new Leaf("Processor", 10500);

        Composite peripherals = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);
        peripherals.addComponent(keyBoard);

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peripherals);
        computer.addComponent(cabinet);

        computer.showPrice();
    }

}
