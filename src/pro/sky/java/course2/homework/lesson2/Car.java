package pro.sky.java.course2.homework.lesson2;

public class Car extends Transport implements ServiceWorks{
    public Car() {
        super();
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre(){
        System.out.println("Change tyres car");
    }

    @Override
    public void checkEngine() {
        System.out.println("Check engine car");
    }
}
