package pro.sky.java.course2.homework.lesson2;

public class ServiceStation{

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre(transport);
            }
            transport.checkEngine(transport);
            transport.checkTrailer(transport);
        }
    }
}
