package pro.sky.java.course2.homework.lesson2;

public class Truck extends Transport {
    public Truck() {
        super();
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre(Transport transport){
        System.out.println("Change tyres truck");
    }

    @Override
    public void checkEngine(Transport transport) {
        System.out.println("Check engine truck");
    }

    @Override
    public void checkTrailer(Transport transport) {
        System.out.println("Check trailer");
    }
}
