package pro.sky.java.course2.homework.lesson2;

public class Truck extends Transport implements ServiceWorks{
    public Truck() {
        super();
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre(){
        System.out.println("Change tyres truck");
    }

    @Override
    public void checkEngine() {
        System.out.println("Check engine truck");
    }

    public void checkTrailer() {
        System.out.println("Check trailer");
    }
}
