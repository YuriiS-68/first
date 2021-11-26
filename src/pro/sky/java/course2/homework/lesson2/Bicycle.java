package pro.sky.java.course2.homework.lesson2;

public class Bicycle extends Transport{
    public Bicycle() {
        super();
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre(Transport transport){
        System.out.println("Change tyres bicycle");
    }
}
