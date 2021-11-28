package pro.sky.java.course2.homework.lesson2;

public class Transport implements ServiceWorks{
    private String modelName;
    private int wheelsCount;

    public Transport() {
    }

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre(Transport transport){

    }
    @Override
    public void checkEngine(Transport transport){

    }

    @Override
    public void checkTrailer(Transport transport){

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
